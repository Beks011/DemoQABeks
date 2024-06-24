import org.testng.annotations.Test;

public class PractiseFormCalendarTest extends BaseTest{

    @Test
    public void test123() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");

        demoQAPages.getPracticeFormPage().selectDateMonthYear("30 Jun 2020");
        Thread.sleep(4000);
    }
}
