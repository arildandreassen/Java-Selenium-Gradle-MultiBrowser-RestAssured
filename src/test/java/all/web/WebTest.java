package all.web;

import config.WebBase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WebTest extends WebBase {

    @Before
    public void setup(){
        System.out.println("setup");
    }

    @Test
    public void webTest(){
        page.main.searchFor("Lionel Messi");
        assertThat(page.article.getFirstHeaderText()).isEqualTo("Lionel Messi");
    }

    @After
    public void teardown(){
        System.out.println("teardown");
    }
}