package BroswerFactory;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by santiago on 10/04/18.
 */

class Chrome extends ChromeDriver implements WebBrowser {

    static {
        System.setProperty("webdriver.chrome.driver", "/home/santiago/Documents/CRHOMEDRIVER/chromedriver");
    }

    public Chrome(){
        super();
    }
}
