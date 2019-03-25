import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTest {
    public static WebDriver driver;

    @BeforeClass
    public static void openBrowser() {
        driver = new ChromeDriver();
    }

    @Test
    public void browserTest() {
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
    }

    @AfterClass
    public static void closeBrowser() {
        driver.quit();
    }

}
