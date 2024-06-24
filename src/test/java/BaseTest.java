import com.demoqa.drivers.DriverManager;
import com.demoqa.helper.WebElementActions;
import com.demoqa.pages.*;
import com.demoqa.utils.RandomUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public  class BaseTest {

    protected WebDriver driver;

    protected TextBoxPage textBoxPage;
    protected RandomUtils randomUtils;
    protected PracticeFormPage practiceFormPage;
    protected WebElementActions webElementActions;
    protected DemoQAPages demoQAPages;


    @BeforeClass(alwaysRun = true)
    public void setup(){
        driver= DriverManager.getDriver();
        textBoxPage = new TextBoxPage();
        randomUtils = new RandomUtils();
        practiceFormPage = new PracticeFormPage();
        webElementActions = new WebElementActions();
        demoQAPages = new DemoQAPages();


        demoQAPages.setUp();




    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        DriverManager.closeDriver();
    }
}
