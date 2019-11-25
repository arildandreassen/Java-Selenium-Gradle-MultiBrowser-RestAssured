package all;

import config.BaseTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestOne extends BaseTest {

    @Test
    public void testOne(){
        page.main.searchFor("Lionel Messi");
        assertThat(page.article.getFirstHeaderText()).isEqualTo("Lionel Messi");
    }
}