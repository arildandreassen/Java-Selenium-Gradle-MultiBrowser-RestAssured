package config;

import org.junit.rules.MethodRule;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ScreenshotOnFailure implements MethodRule {

    private WebDriver driver;

    public ScreenshotOnFailure(WebDriver driver){
        this.driver = driver;
    }

    public Statement apply(final Statement statement, final FrameworkMethod frameworkMethod, final Object o){
        return new Statement(){

            @Override
            public void evaluate() throws Throwable {
                try {
                    statement.evaluate();
                } catch (Throwable t){
                    captureScreenshot(frameworkMethod.getName());
                    throw t;
                }
            }

            public void captureScreenshot(String fileName) throws IOException {
                System.out.println("driver: " + driver);
                File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                new File("screenshots/").mkdir();
                File targetFile = new File("screenshots/" + fileName + ".png");
                Files.copy(scrFile.toPath(), targetFile.toPath());
            }
        };
    }
}
