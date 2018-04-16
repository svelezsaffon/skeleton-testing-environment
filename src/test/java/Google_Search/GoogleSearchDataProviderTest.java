package Google_Search;

import BroswerFactory.WebBrowser;
import BroswerFactory.WebDriverFactory;
import DataProviders.DataProviders;
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
    private String browserToUse;

    @Parameters({"browser"})
    @BeforeTest
    public void setUp(String browser) throws IOException {
        prop=TestingProperties.getInstance();
        browserToUse=browser;
    }


    @BeforeMethod
    public void initTest(){
        browser= WebDriverFactory.createDriver(this.browserToUse);
    }


    @Test(dataProvider = "GoogleUsersRole", dataProviderClass= DataProviders.class)
    public void searchInGoogle(Roles users){
        user=UserFactory.createUser(users);
        browser.get(GooglePom.URL);
        GooglePom page=new GooglePom(browser);
        user.verify(page);
    }

    @AfterMethod
    public void closeTest(){
        this.browser.quit();
    }


}
