package Google_Search;

import BroswerFactory.WebBrowser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by santiago on 11/04/18.
 */
public class GooglePom {

    public static final String URL="http://www.google.com";

    @FindBy(name="q")
    WebElement searchBox;

    public GooglePom(WebBrowser browser){
        PageFactory.initElements(browser,this);
    }


    public void sendTextToSearch(String text){

        this.searchBox.sendKeys(text);
    }
}
