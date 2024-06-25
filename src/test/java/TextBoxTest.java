import com.demoqa.drivers.DriverManager;
import com.demoqa.entities.TextBoxEntity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {
     @Test(groups = {"Smoke","1","UI"},description = "TextBoxTest")
    public void textBoxTest(){
         driver.get("https://demoqa.com/text-box");
         TextBoxEntity textBoxEntity = randomUtils.generaterandomTextBoxEntity();
         textBoxPage.fillUpTextBoxForm(textBoxEntity);
     }
}
