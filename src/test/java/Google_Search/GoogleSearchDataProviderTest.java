package Google_Search;

import BroswerFactory.WebBrowser;
import BroswerFactory.WebDriverFactory;
import Properties.TestingProperties;
import UserFactory.User;
import UserFactory.UserFactory;
import org.testng.annotations.*;
import UserFactory.Roles;
import java.io.IOException;

/**
 * Created by santiago on 11/04/18.
 */
public class GoogleSearchDataProviderTest {

    private TestingProperties prop;
    private WebBrowser browser;
    private User user;

    @BeforeTest
    public void setUp() throws IOException {
        prop=TestingProperties.getInstance();

    }

    @BeforeMethod
    public void initTest(){
        browser= WebDriverFactory.createDriver(this.prop.getStringProperty(TestingProperties.DRIVER_TYPE));
    }


    @Test(dataProvider = "GoogleUsers")
    public void searchInGoogle(Roles users){
        user=UserFactory.createUser(users);
        browser.get("http://www.google.com");
        GooglePom page=new GooglePom(browser);
        user.verify(page);
    }

    @AfterMethod
    public void closeTest(){
        try {
            Thread.sleep(10000);
            this.browser.quit();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @DataProvider(name ="GoogleUsersRole")
    public static Roles[] getRolesToTest(){
        Roles[] users = { Roles.admin, Roles.regular, Roles.visitor };
        return users;
    }



}
