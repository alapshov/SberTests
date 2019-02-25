import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webdriver.InizializeWebDriver;


public class Tests extends InizializeWebDriver {


    @BeforeClass
    public void setUp() {

        wd = InizializeWebDriver.initializeChromeDriver("http://81.177.48.233:443/@tools/register.html");


    }

    @AfterClass
    public void tearDown() {
        //InizializeWebDriver.quitChromeDriver();
    }

    @Test
    public void checkGetRequest(){

    }

}
