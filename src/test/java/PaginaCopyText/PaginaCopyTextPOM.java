package PaginaCopyText;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.soap.Text;

/**
 * Created by santiago on 9/04/18.
 */
public class PaginaCopyTextPOM {

    @FindBy(id="saludar_publico")
    WebElement saludarPublico;


    @FindBy(id="text_to_move")
    WebElement textToMove;


    @FindBy(id="text_to_move")
    WebElement copyText;


    public PaginaCopyTextPOM(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void writeText(String text){
        this.textToMove.sendKeys(text);
    }

    public void clickCopyText(){
        this.copyText.click();
    }

    public void saludarPublico(){
        this.saludarPublico.click();
    }

    public String getTextFromButton(){
        return this.copyText.getText();
    }


}
