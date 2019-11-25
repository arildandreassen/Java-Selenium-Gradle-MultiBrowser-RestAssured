package all;

import config.BaseTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class TestOne extends BaseTest {

    @Test
    public void testOne(){
        mainPage.searchFor("Lionel Messi");
        assertThat(articlePage.getFirstHeaderText()).isEqualTo("Lionel Messi");
    }
}