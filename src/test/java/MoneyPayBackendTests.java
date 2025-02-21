import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MoneyPayBackendTests {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://api.restful-api.dev";
    }

    @Test
    public void testApiStatus() {
        Response response = RestAssured.get("/objects");
        int statusCode = response.getStatusCode();

        if (statusCode == 200) {
            Reporter.log("Test PASSED - Status Code: " + statusCode);
        }
        else if (statusCode == 400) {
            Reporter.log("Test FAILED - Status Code: " + statusCode);
        }
        else {
            Reporter.log("Unexpected Status Code: " + statusCode + " (Only 200 and 400 status codes are evaluated)");
        }
    }
}
