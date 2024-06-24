import com.demoqa.entities.PractiseFormEntity;
import org.testng.annotations.Test;

public class PracticeFormTest extends BaseTest {
    @Test(groups = {"E2E_Test","3"},description = "PracticeFormTest")
    public void practiceFormTest() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        PractiseFormEntity practiseFormEntity = randomUtils.ganeraterandomPractiseFormEntity();
        practiceFormPage.fillUpPracticeFormPage(practiseFormEntity);
        Thread.sleep(5000);
    }
}
