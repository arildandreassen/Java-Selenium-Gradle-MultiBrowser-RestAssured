package all.rest;

import config.RestBase;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestTest extends RestBase {

    @Test
    public void restTest(){
        get(getRootUrl()+ "/posts/1")
                .then()
                .body("userId", equalTo(1));
    }
}
