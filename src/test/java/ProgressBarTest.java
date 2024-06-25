import org.testng.annotations.Test;

public class ProgressBarTest extends BaseTest{
    @Test(groups = {"Smoke","4","UI"},description = "ProgressBarTest")
    public void progressBarTest(){
        driver.get("https://demoqa.com/progress-bar");
        webElementActions.click(demoQAPages.getProgressBarPage().startBtn);
        demoQAPages.getProgressBarPage().aria_valueNow.getText();

    }
}
