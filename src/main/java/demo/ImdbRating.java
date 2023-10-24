package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImdbRating {

    ChromeDriver driver;

    public ImdbRating() {
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
        driver.get("https://www.imdb.com/chart/top");
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        WebElement sortBy = driver.findElement(By.xpath("//*[@id=\"lister-sort-by-options\"]"));
        Select dropdown = new Select(sortBy);

        dropdown.selectByVisibleText("Ranking");
        String highestRatedMovie = driver
                .findElement(By.xpath("//*[@id=\"main\"]/div/span/div[1]/div/div[3]/table/tbody/tr[1]/td[2]"))
                .getText();

        dropdown.selectByVisibleText("Release Date");
        String oldestMovie = driver
                .findElement(By.xpath("//*[@id=\"main\"]/div/span/div[1]/div/div[3]/table/tbody/tr[250]/td[2]"))
                .getText();
        String newestMovie = driver
                .findElement(By.xpath("//*[@id=\"main\"]/div/span/div[1]/div/div[3]/table/tbody/tr[1]/td[2]"))
                .getText();

        dropdown.selectByVisibleText("Number of Ratings");
        String userRating = driver
                .findElement(By.xpath("//*[@id=\"main\"]/div/span/div[1]/div/div[3]/table/tbody/tr[1]/td[2]"))
                .getText();

        int totalMovies = driver
                .findElements(By.xpath("//*[@id=\"main\"]/div/span/div[1]/div/div[3]/table/tbody/tr/td[2]")).size();

        System.out.println(
                "Highest Rated Movie = " + highestRatedMovie + " Oldest Movie = " + oldestMovie + " Newest Movie = "
                        + newestMovie + " Most User Rating = " + userRating + " Total mvies = " + totalMovies);
        System.out.println("end Test case: testCase01");

    }

}
