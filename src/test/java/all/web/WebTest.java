package all.web;

import config.WebBase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class WebTest extends WebBase {

    @Before
    public void setup(){
        logger.info("setting up webTest");
    }

    @Test
    public void webTest(){
        page.main.searchFor("Lionel Messi");
        assertThat(page.article.getFirstHeaderText(), equalTo("Lionel Messi"));
    }

    @After
    public void teardown(){
       logger.info("tearing down webTest");
    }
}