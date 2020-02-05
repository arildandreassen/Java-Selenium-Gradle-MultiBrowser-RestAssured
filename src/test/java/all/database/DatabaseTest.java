package all.database;

import config.DatabaseConnection;
import org.json.JSONArray;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class DatabaseTest extends DatabaseConnection {

    @Test
    public void databaseTest(){
        String query = "select * from Username";
        JSONArray result = runQuery(query);

        assertThat(result.getJSONObject(0).get("Username"))
                .isEqualTo("arild");
    }
}
