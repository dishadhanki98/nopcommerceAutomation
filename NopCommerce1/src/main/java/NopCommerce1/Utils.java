package NopCommerce1;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends BasePage
{
    //Clicking Element
    public static void clickElement(By by)
    {
        driver.findElement(by).click();
    }
    //isDisplayed()
    public static boolean webElementisDisplayed(By by)
    {
        return driver.findElement(by).isDisplayed();
    }
    //wait for invisible
    public static void waitForElementInvisble(By by, long time)
    {
        WebDriverWait wait = new WebDriverWait(BasePage.driver, time);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }
    //Getting text from Element
    public static String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }
    //Entering Text
    public static void enterText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }
    //Wait for alert to display
    public static void waitForAlertPresent(long time)
    {
        WebDriverWait wait = new WebDriverWait(BasePage.driver,time);
        wait.until(ExpectedConditions.alertIsPresent());
    }
}
