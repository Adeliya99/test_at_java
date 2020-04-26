import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;
import static io.restassured.RestAssured.*;
import static io.restassured.path.json.JsonPath.from;



public class ApiTest {
    @Test
        public void GetTest() {
        Response response = get("https://reqres.in/api/users?page=2");
        Assert.assertEquals(200, response.getStatusCode());

        List<Data> dataList = Arrays.asList(from(response.getBody().asString()).getObject("data", Data[].class));

        for (Data userData : dataList) {
            Assert.assertNotNull(userData.getId());
            Assert.assertNotNull(userData.getEmail());
            Assert.assertNotNull(userData.getFirst_name());
            Assert.assertNotNull(userData.getLast_name());
            Assert.assertNotNull(userData.getAvatar());
        }
    }
}
