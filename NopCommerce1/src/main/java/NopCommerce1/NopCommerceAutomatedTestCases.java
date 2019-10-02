package NopCommerce1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class NopCommerceAutomatedTestCases extends Utils
{
    LoadProp loadProp = new LoadProp();
    static SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void opensTheChromeBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "src\\main\\Resources\\ChromeBrowserDriver\\chromedriver.exe");
        //open the browser
        driver = new ChromeDriver();
        //maximise screen window
        driver.manage().window().fullscreen();
        //setting time implicitly
        driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
        //accessing url from testData page
        driver.get(loadProp.getProperty("url"));
    }
    @AfterMethod
    public void closesTheChromeBrowser()
    {
        driver.quit();
    }
    @Test (priority = 0)
    public static void userShouldBeAbleToCompareProductList() {
        int counter = 0, counter1 = 0;
        //adding first product to the compare list
        clickElement(By.xpath("//div//input[@onclick='return AjaxCart.addproducttocomparelist(\"/compareproducts/add/4\"),!1']"));
        try
        {
            Thread.sleep(5000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        clickElement(By.xpath("//div//input[@onclick='return AjaxCart.addproducttocomparelist(\"/compareproducts/add/1\"),!1']"));
        softAssert.assertTrue(driver.findElement(By.linkText("product comparison")).isDisplayed());
        clickElement(By.xpath("//p//a[text()=\"product comparison\"]"));
        List<WebElement> compareProductList = driver.findElements(By.xpath("//tr[@class=\"product-name\"]"));
        System.out.println(compareProductList.size());
        for (WebElement e: compareProductList)
        {
            //condition applied that product compare list should contain both products else
            if(e.getText().contains("Build your own computer") && e.getText().contains("Apple MacBook Pro 13-inch"))
            {
                System.out.println("Products in the Compare List: " + "Build your own computer " + " & " + " Apple MacBook Pro 13-inch");
                counter++;
            }
            else
            {
                System.out.println("The products listed is not in the compare list");
                counter1++;
            }
            System.out.println(counter);
            System.out.println(counter1);
            softAssert.assertEquals(compareProductList,counter);

            clickElement(By.xpath("//a[@onclick='setLocation(\"/clearcomparelist\")']"));
            String clearProductFromCompareListExpected = "You have no items to compare.";
            String clearProductFromCompareListActual = getTextFromElement(By.xpath("//div[@class='no-data']"));
            softAssert.assertEquals(clearProductFromCompareListActual, clearProductFromCompareListExpected);
      }
    }

        @Test (priority = 1)
        public void userShouldBeAbleToAddCommentsOnNewOnlineStoreIsOpen()
        {
            //Within in News, click on the first News Story New Online Store is Open
            clickElement(By.linkText("New online store is open!"));
            //Write a comment Title in the text area provided
            enterText(By.name("AddNewComment.CommentTitle"), "YOLO");
            //Write a comment in the text box area
            enterText(By.name("AddNewComment.CommentText"), "I may not be doing it right!");
            //click New Comment to add comment
            clickElement(By.name("add-comment"));
            //comment should be displayed
            softAssert.assertTrue(webElementisDisplayed(By.xpath("//div[text()='News comment is successfully added.']")));
            List <WebElement> commentSizeList = driver.findElements(By.xpath("//div[@class='comment news-comment']"));
            System.out.println("List of Comments Size: " + commentSizeList.size());
            WebElement commentsList1=commentSizeList.get(commentSizeList.size()-1);
            String lastestcommentText=(commentsList1.getText());
            System.out.println(lastestcommentText);
            if(commentsList1.getAttribute("outerHTML").contains("comment-time"))
            {
                System.out.println("comments details");
            }
            softAssert.assertTrue(commentsList1.getAttribute("outerHTML").contains("comment-time"));
            softAssert.assertAll();

        }

    }

