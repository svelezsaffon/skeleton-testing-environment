package PaginaCopyText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;

/**
 * Created by santiago on 9/04/18.
 */
public class PaginaCopyTextTest {


    private WebDriver driver;
    private PaginaCopyTextPOM page;

    WebElement cuqlueria;



    @BeforeTest
    public void setUpTest(){
        this.driver=new FirefoxDriver();

        this.page= new PaginaCopyTextPOM(this.driver);

        this.cuqlueria=driver.findElement(By.id("jdjd"));
    }

    /**
     * En este metodo ejecuto el test
     */
    @Test
    public void test(){
        this.page.writeText("Santiago is sending test");

        assert this.page.getTextFromButton().equals("Mi mensajito") : "";
    }

    /**
     * En este metodo cierro el test. Debo cerrar todo lo que utlice
     * Cerra sesion, cerrar browser, etc..
     */
    @AfterTest
    public void afterTest(){
        this.driver.quit();
    }


}
