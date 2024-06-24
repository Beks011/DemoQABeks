import com.demoqa.entities.Employee;
import com.demoqa.pages.BasePage;
import com.demoqa.utils.RandomUtils;
import org.testng.annotations.Test;

import java.util.List;

public class WebTablesTest extends BaseTest {
    @Test(description = "Practice form test")
    public void test123(){
        driver.get("https://demoqa.com/webtables");
        demoQAPages.getWebTablesPage().addNewEmployee(randomUtils.createMockEmployee());

        List<Employee> employees = demoQAPages.getWebTablesPage().getEmployeesFromTable();

        for (Employee employee: employees){
            System.out.println(employee);
        }
    }
}
