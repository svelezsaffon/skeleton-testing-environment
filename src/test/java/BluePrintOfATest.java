import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;

/**
 * Created by santiago on 4/04/18.
 */
public class BluePrintOfATest {

    private ArrayList<String> words;

    /**
     * En este metodo debo hacer toda la carga de avriables,
     * Debo conseguir todo lo que voy a utlizar en el test
     */
    @BeforeTest
    public void setUpTest(){
        words=new ArrayList<>();
        words.add("santiago");
        words.add("velez");
        words.add("saffon");
    }

    /**
     * En este metodo ejecuto el test
     */
    @Test
    public void test(){

        Assert.assertTrue(words.contains("santiago"),"La lista de palabras no contiene la palabra santiago");
        Assert.assertTrue(words.contains("velez"),"La lista de palabras no contiene la palabra velez");
        Assert.assertTrue(words.contains("Jorge"),"La lista de palabras no contiene la palabra saffon");
    }

    /**
     * En este metodo cierro el test. Debo cerrar todo lo que utlice
     * Cerra sesion, cerrar browser, etc..
     */
    @AfterTest
    public void afterTest(){
        words.clear();
    }


}
