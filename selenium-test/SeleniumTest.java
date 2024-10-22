import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class SeleniumTest {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIVEK KUMAR SINGH\\Downloads\\chromedriver_win32\\chromedriver.exe");

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.google.com");

        // Find the search box element by name and enter a search term
        driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");

        // Submit the search form
        driver.findElement(By.name("q")).submit();

        // Print the page title
        System.out.println("Page title is: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}
