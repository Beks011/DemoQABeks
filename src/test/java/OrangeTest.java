import com.demoqa.enums.PanelMenu;
import com.demoqa.enums.TopBarMenuEnams;
import com.demoqa.pages.OrangePage;
import org.testng.annotations.Test;

public class OrangeTest extends BaseTest{
    @Test(groups = {"Regression","2"},description = "OrangeTest")
    public void orangeTest() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        orangePage.fillupRegistration();
        Thread.sleep(5000);

    }
}
