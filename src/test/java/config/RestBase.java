package config;

import org.junit.BeforeClass;

public class RestBase extends Utilities{

    @BeforeClass
    public static void beforeAll(){
        logger.info("Rest setup");
    }

    public String getRootUrl() {
        return "https://jsonplaceholder.typicode.com";
    }

}
