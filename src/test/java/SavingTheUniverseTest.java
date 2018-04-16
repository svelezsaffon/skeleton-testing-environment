import BroswerFactory.WebBrowser;
import BroswerFactory.WebDriverFactory;
import Properties.TestingProperties;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;


/**
 * Created by santiago on 8/04/18.
 */
public class SavingTheUniverseTest {

    private TestingProperties prop;
    private WebBrowser browser;


    @BeforeTest
    public void initTestCase() throws IOException {
        this.prop=TestingProperties.getInstance();
        browser= WebDriverFactory.createDriver(this.prop.getStringProperty("driver"));
    }


    @Test
    public void test(){
        browser.get("http://www.google.com");
        assert browser.getCurrentUrl().contains("google");
    }

    @AfterTest
    public void closeTest(){
        browser.quit();
    }

}
