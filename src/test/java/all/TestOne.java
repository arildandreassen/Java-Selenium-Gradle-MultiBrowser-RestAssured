package all;

import config.WebBase;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class TestOne extends WebBase {

    @Test
    public void testOne(){
        page.main.searchFor("Lionel Messi");
        assertThat(page.article.getFirstHeaderText()).isEqualTo("Lionel Messi");
    }
}