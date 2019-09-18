package nopcommerce.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Utils extends BasePage
{
    //Entering Text
    public static void enterText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    //Getting text from Element
    public static String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }

    //Clicking Element
    public static void clickElement(By by)
    {
        driver.findElement(by).click();
    }

    //wait for element to be visible
    public static void waitForElementVisible(By by, long time)
    {
        WebDriverWait wait = new WebDriverWait(BasePage.driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    //wait for element to be invisible
    public static void waitForElementInvisble(By by, long time)
    {
        WebDriverWait wait = new WebDriverWait(BasePage.driver, time);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    //Wait for locator to be clickable for given time in seconds
    public static  void waitForClickable(By by, long time)
    {
        WebDriverWait wait = new WebDriverWait(BasePage.driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    //Wait for alert to display
    public static void waitForAlertPresent(long time)
    {
        WebDriverWait wait = new WebDriverWait(BasePage.driver,time);
        wait.until(ExpectedConditions.alertIsPresent());
    }


    //Select By Visible Text Drop Down
    public static void selectByVisibleText(By by, String value)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(value);
    }

    //Selects By Visible Value Drop Down
    public static void selectByVisibleValue(By by, String value)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
        select.getFirstSelectedOption();
    }

    //Selects by Index Value Drop Down
    public static void selectByIndexValue(By by, int value)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(value);
    }

    //clears entered text
    public static void clearMethod (By by)
    {
        driver.findElement(by).clear();
    }

    //clears and enters text
    public static void clearandEntertext(By by,String text)
    {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }

    //opens Chrome Browser driver
    public void opensChromeBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "src\\main\\Resources\\BrowserDriver\\chromedriver.exe");
        //open the browser
        driver = new ChromeDriver();
        //maximise screen window
        driver.manage().window().fullscreen();
        //setting time implicitly
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }

    //generating different emails
    public String generateEmail(String startValue)
    {
        String email = startValue.concat(new Date().toString());
        return email;
    }

    //generating random dates for tests
    public static String randomDate()
    {
        DateFormat format = new SimpleDateFormat("ddMMyyHHmmSS");
        return format.format(new Date());
    }

    //Navigate back on webpage
    public void navigateBackChromeWindow()
    {
        driver.navigate().back();
    }

    //checking webelement present on webpage
    //1. isSelected()
    public boolean webElementIsSelected(By by)
    {
        return driver.findElement(by).isSelected();
    }

    //2. isEnabled()
    public boolean webElementIsEnabled(By by)
    {
        return driver.findElement(by).isEnabled();
    }

    //3. isDisplayed()
    public  boolean webElementisDisplayed(By by)
    {
        return driver.findElement(by).isDisplayed();
    }

    //Get Attribute of Element
    public void getAttributeElement(By by,String text)
    {
        driver.findElement(by).getAttribute(text);
    }

    // Get CSS Property of Element
    public void getCssPropertyElement(By by,String text)
    {
        driver.findElement(by).getCssValue(text);
    }

    //Driver Quit
    public void closesTheChromeBroswer()
    {
        driver.quit();
    }

}
