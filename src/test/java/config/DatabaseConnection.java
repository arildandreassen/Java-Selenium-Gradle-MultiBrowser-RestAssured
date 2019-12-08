package config;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.sql.*;

public class DatabaseConnection extends Utilities{

    public static Connection conn = null;

    @BeforeClass
    public static void beforeAll() {

        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=TestDB;user=testuser;password=password";
            conn = DriverManager.getConnection(url);

            System.out.println("Got it!");

        } catch (SQLException e) {
            throw new Error("Unable to acquire DB Connection", e);
        }
    }

    @AfterClass
    public static void afterAll(){
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public JSONArray runQuery(String query){
        String jsonString = "";
        JSONObject jsonobject = null;
        JSONArray jsonArray = new JSONArray();

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {

                ResultSetMetaData metaData = rs.getMetaData();
                jsonobject = new JSONObject();

                for (int i = 0; i < metaData.getColumnCount(); i++) {
                    jsonobject.put(metaData.getColumnLabel(i + 1),rs.getObject(i + 1));
                }
                jsonArray.put(jsonobject);
            }

            if (jsonArray.length() > 0) {
//                jsonString= jsonArray.toString();
                return jsonArray;
            }

            logger.info(jsonString);
        }    catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}
