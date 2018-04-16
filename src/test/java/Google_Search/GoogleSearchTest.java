package Google_Search;

import BroswerFactory.WebBrowser;
import BroswerFactory.WebDriverFactory;
import Properties.TestingProperties;
import UserFactory.User;
import UserFactory.UserFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.IOException;

/**
 * Created by santiago on 11/04/18.
 */
public class GoogleSearchTest {


    private TestingProperties prop;
    private WebBrowser browser;
    private User user;

    @BeforeTest
    public void setUp() throws IOException {
        prop=TestingProperties.getInstance();
        browser= WebDriverFactory.createDriver(this.prop.getStringProperty(TestingProperties.DRIVER_TYPE));
        user=UserFactory.createUser(this.prop.getStringProperty(TestingProperties.USER_ROLE));
    }


    @Test
    public void searchInGoogle(){
        browser.get(GooglePom.URL);
        GooglePom page=new GooglePom(browser);
        user.verify(page);
    }

    @AfterTest
    public void shutDown(){
        //browser.quit();
    }
}
