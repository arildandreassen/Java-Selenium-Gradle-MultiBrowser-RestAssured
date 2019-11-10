package all;

import config.BaseTest;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestOne extends BaseTest {

    @Test
    public void testOne(){
        mainPage.searchFor("Lionel Messi");
        Assertions.assertThat(articlePage.getFirstHeaderText()).isEqualTo("Lionel Messi");
    }
}