package Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page3Test {
    @Test
    public void testPage3() throws InterruptedException {
        // Optional. If not specified, WebDriver searches the PATH for chromedriver.
        System.setProperty("webdriver.chrome.driver", "C:\\mydriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String url = "http://www.okna103.by/";
        driver.get(url);
        Thread.sleep(5000);  // Let the user actually see something!
        WebElement searchBox = driver.findElement(By.cssSelector("div#topmenu ul li:nth-child(3)"));
        searchBox.click();
        Thread.sleep(5000);  // Let the user actually see something!
        String url1 = "http://www.okna103.by/remont_derevyannyh_okon.html";
        String url2 = driver.getCurrentUrl();
        Assert.assertEquals(url1,url2);
        driver.quit();
    }
}
