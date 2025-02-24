package selenium_topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L2_HandleShadowDOM {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("chrome://settings/");
        WebElement pageHeader = driver.findElement(By.tagName("settings-ui")).getShadowRoot()
                .findElement(By.cssSelector("#toolbar")).getShadowRoot()
                .findElement(By.cssSelector("h1"));

        System.out.println(pageHeader.getText());
        Thread.sleep(3000);
        driver.quit();

    }
}
