package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
///

public class TestCases {
    ChromeDriver driver;

    public TestCases() {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest() {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    public void testCase01() throws InterruptedException {
        // System.out.println("Start Test case: testCase01");
        // driver.navigate().to("https://www.google.com");
        // driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        // driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("amazon");
        // Actions action = new Actions(driver);
        // action.sendKeys(Keys.ENTER).perform();
        // boolean result =
        // driver.findElement(By.xpath("//h3[normalize-space()='Amazon.in']")).isDisplayed();
        // System.out.println("Result is displayed or not ? " + result);
        // System.out.println("end Test case: testCase01");

        System.out.println("Start Test case: testCase01");
        driver.navigate().to("https://in.bookmyshow.com/explore/home/chennai");
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        List<WebElement> allLinks = driver.findElements(By.xpath("//a[@href]"));
        System.out.println("Total Number of Links " + allLinks.size());
        System.out.println("end Test case: testCase01");

    }

    public void testCase02() {
    }

}
