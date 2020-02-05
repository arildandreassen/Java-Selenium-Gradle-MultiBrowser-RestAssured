package all.rest;

import config.RestBase;
import org.junit.Test;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;

public class RestTest2 extends RestBase {

    @Test
    public void restTest(){
        get(getRootUrl() + "/posts/1")
                .then()
                .statusCode(200)
                .body("userId", equalTo(1));
    }
}
