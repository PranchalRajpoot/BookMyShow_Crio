package demo;

import org.bouncycastle.oer.Switch;
import org.bouncycastle.util.Arrays.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {
    ChromeDriver driver;
     public void NestedFrame(){
System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     }

public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01()
    {
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
        String newURL=driver.getCurrentUrl();
        System.out.println("Current URl " +  newURL );

        //Count number of windows
        int tottalWindows=driver.getWindowHandles().size();
        System.out.println("Total Windows :"+tottalWindows);
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        int totalWindows=driver.getWindowHandles().size();
        System.out.println("Total Windows after click event :"+totalWindows);
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        //driver.switchTo().window(null)
       // driver.switchTo().window(WindowType. WINDOW);
       //driver.switchTo().newWindow(WindowType. WINDOW);
       //driver.switchTo().
       Set<String> allwins= driver.getWindowHandles();
       java.util.Iterator<String> it= allwins.iterator();
       String parentURL=it.next();
       String childurl=it.next();
       System.out.println("Parent Windoe"+parentURL );
       System.out.println("child Windoe"+childurl );
        driver.switchTo().window(childurl);   
           newURL=driver.getCurrentUrl();
        System.out.println("Current URl after new window launch  :  " +  newURL );
       

    }
    
}