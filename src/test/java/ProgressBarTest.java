import org.testng.annotations.Test;

public class ProgressBarTest extends BaseTest{
    @Test(groups = {"Smoke","4"},description = "ProgressBarTest")
    public void progressBarTest(){
        driver.get("https://demoqa.com/progress-bar");
        webElementActions.click(progressBarPage.startBtn);
        progressBarPage.aria_valueNow.getText();

    }
}