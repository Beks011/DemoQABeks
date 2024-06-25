import com.demoqa.entities.PractiseFormEntity;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeFormTest extends BaseTest {
    @Test(groups = {"E2E_Test","3","UI"},description = "PracticeFormTest")
    public void practiceFormTest() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        PractiseFormEntity practiseFormEntity = randomUtils.ganeraterandomPractiseFormEntity();
        practiceFormPage.fillUpPracticeFormPage(practiseFormEntity);
        Thread.sleep(5000);
        Assert.assertEquals(practiceFormPage.currentAddressInput.getText(),"hgfghjk");
    }
}
