package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageUrl {


    ChromeDriver driver;

    public ImageUrl() {
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

        System.out.println("Start Test case: testCase01");
        driver.get("https://in.bookmyshow.com/explore/home/chennai");
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='style__WidgetContainerBody-sc-lnhrs7-4 YeNog']//img"));
        for(int i=0; i<allLinks.size(); i++)
        {
            System.out.println("Link:--> " + (allLinks.get(i)).getAttribute("src"));
        }
        String movieName = driver.findElement(By.xpath("//div[@class='sc-7o7nez-0 zDfcI'][normalize-space()='Sniper: G.R.I.T. - Global Response & Intelligence Team']")).getText(); 
        System.out.println("Movie name" + movieName);

          String languageName = driver.findElement(By.xpath("//a[@id='https://in.bookmyshow.com/chennai/movies/sniper-grit-global-response-intelligence-team/ET00371568-1']//div[@class='sc-7o7nez-0 veMGd'][normalize-space()='English']")).getText(); 
        System.out.println("Language name" + languageName);

        

        System.out.println("end Test case: testCase01");
    }

    }
