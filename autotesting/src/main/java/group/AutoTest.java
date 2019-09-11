package group;

import javafx.scene.layout.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class AutoTest
    {
        protected static WebDriver driver;
        public String generateEmail (String startValue)
        {
            String email = startValue.concat(new Date().toString());
             return email;
        }
        public static String randomDate()
        {
            DateFormat format = new SimpleDateFormat("ddMMyyHHmmSS");
            return format.format(new Date());
        }

        @BeforeMethod
        public void opensTheChromeBrowser ()
        {
        System.setProperty("webdriver.chrome.driver", "src\\main\\Resources\\BrowserDriver\\chromedriver.exe");
        //open the browser
        driver = new ChromeDriver();
        //maximise screen window
        driver.manage().window().fullscreen();
        //setting time implicitly
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        //open the website
        }
       @AfterMethod
        public void closesTheChromeBroswer()
        {
            driver.quit();
        }

        @Test (priority = 0)
        public void userShouldBeAbleToRegisterSuccessfully()
        {
            //open the website
            driver.get("https://demo.nopcommerce.com/");

            //click on register button
            driver.findElement(By.xpath("//a[@class='ico-register']")).click();
            //enter firstname
            driver.findElement(By.id("FirstName")).sendKeys("Mememe");
            //enter lastname
            driver.findElement(By.xpath("//input[@name=\"LastName\" or id=\"LastName\"]")).sendKeys("Doe");
            //enter email
            driver.findElement(By.name("Email")).sendKeys("disha" + randomDate() + "@my365.dmu.ac.uk");
            //enter password
            driver.findElement(By.xpath("//input[@data-val-required=\"Password is required.\" and @id=\"Password\"]")).sendKeys("Lememes");
            //confirm password
            driver.findElement(By.name("ConfirmPassword")).sendKeys("Lememes");
            //click register
            driver.findElement(By.className("register-next-step-button")).click();
            //Expected Result
            String expectedResult = ("Thank you Registration Completed");
            // Actual Result
            String actualResult = driver.findElement(By.xpath("//div[@class='result']")).getText();
            Assert.assertEquals(expectedResult,actualResult);

        }

        @Test (priority = 1)
        public void userShouldBeAbleToReferAProductToAFriend()
        {
        driver.navigate().to("https://demo.nopcommerce.com/");

            //click on register button
            driver.findElement(By.xpath("//a[@class='ico-register']")).click();
            //enter firstname
            driver.findElement(By.id("FirstName")).sendKeys("Mememe");
            //enter lastname
            driver.findElement(By.xpath("//input[@name=\"LastName\" or id=\"LastName\"]")).sendKeys("Doe");
            //enter email
            driver.findElement(By.name("Email")).sendKeys("disha" + randomDate() + "@my365.dmu.ac.uk");
            //enter password
            driver.findElement(By.xpath("//input[@data-val-required=\"Password is required.\" and @id=\"Password\"]")).sendKeys("Lememes");
            //confirm password
            driver.findElement(By.name("ConfirmPassword")).sendKeys("Lememes");
            //click register
            driver.findElement(By.className("register-next-step-button")).click();
            //continue
            driver.findElement(By.className("register-continue-button")).click();
        //click on Computers from navigation bar
        driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"] //a[@href=\"/computers\"]")).click();
        //then click on Notebook
        driver.findElement(By.linkText("Notebooks")).click();
        //Click on Apple MacBook product
        driver.findElement(By.linkText("Apple MacBook Pro 13-inch")).click();
        //click on Email a friend button
        driver.findElement(By.xpath("//input[@value=\"Email a friend\"]")).click();
        //Enter Friend's Email address
        driver.findElement(By.cssSelector("input[class=friend-email]")).sendKeys("dishadhanki1998@gmail.com");
        //Enter a message
        driver.findElement(By.xpath("//*[@id=\"PersonalMessage\"]")).sendKeys("It works!!");
        //Click on Send Email
        driver.findElement(By.className("send-email-a-friend-button")).click();

        //Expected Result
            String expectedResult = ("Your message has been sent.");
            // Actual Result
            String actualResult = driver.findElement(By.xpath("//div[@class='result']")).getText();
            Assert.assertEquals(actualResult,expectedResult);
    }

   @Test (priority = 2)
        public void userShouldBeAbleToNavigateToCameraAndPhotoPage()
   {
       driver.navigate().to("https://demo.nopcommerce.com/");

       driver.findElement(By.linkText("Electronics")).click();
       driver.findElement(By.linkText("Camera & photo")).click();

       //Expected Result
       String expectedResult = ("Camera and Photo");
       //Actual Result
       String actualResult = driver.findElement(By.tagName("h1")).getText();
       Assert.assertEquals(actualResult,expectedResult);
   }
   @Test (priority = 3)
        public void userShouldBeAbleToSelectJewellery()
   {
       driver.navigate().to("https://demo.nopcommerce.com/");


       driver.findElement(By.linkText("Jewelry")).click();
       driver.findElement(By.xpath("//a[@href=\"//demo.nopcommerce.com/jewelry?price=700-3000\"]")).click();
       //Expected Result Jewelry
       String expectedResult = ("Jewellery");
       //Actual Result
      String actualResult = driver.findElement(By.tagName("h1")).getText();
      //Assert.assertEquals(actualResult,expectedResult);


       //Expected Result Range
       String expectedResultRange = driver.findElement(By.xpath("//span[@class=\"price actual-price\"]")).getText();
       //replacing characters like $ and ,
       String replaceString = String.valueOf(expectedResultRange.replace("$", ""));
       String replaceString2 = String.valueOf(replaceString.replace(",",""));
       //converting double to int
       double price = Double.valueOf(replaceString2);
       //Actual Result
      Assert.assertTrue( price >= 700 && price <= 3000);
   }

   @Test (priority = 4)
        public void userShouldBeAbleToAddTheItemsInTheBasket()
   {
       driver.navigate().to("https://demo.nopcommerce.com/");

       //click on Books category
       driver.findElement(By.linkText("Books")).click();
       //clicking on Fahrenheit 451
       driver.findElement(By.linkText("Fahrenheit 451 by Ray Bradbury")).click();
       //clicking on Fahrenheit 451 and adding to cart
       driver.findElement(By.id("add-to-cart-button-37")).click();
       //closing the cart bar
       driver.findElement(By.className("close")).click();
       //going back to add another product
       driver.navigate().back();
       //selecting another book
       driver.findElement(By.linkText("First Prize Pies")).click();
       //adding another book to the cart
       driver.findElement(By.id("add-to-cart-button-38")).click();
       //closing the item added to cart bar
       driver.findElement(By.className("close")).click();
       //going to the shopping to see if the correct items are added or not
       driver.findElement(By.linkText("Shopping cart")).click();

       //Expected Result
       String expectedResultsProduct1 = "FR_451_RB";
       //Actual Result
       String actualResultsProduct1 = driver.findElement(By.xpath("//span[text()=\"FR_451_RB\"]")).getText();
       Assert.assertEquals(actualResultsProduct1, expectedResultsProduct1);

       //Expected Result
       String expectedResultsProduct2 = "FIRST_PRP";
       //Actual Result
       String actualResultsProduct2 = driver.findElement(By.xpath("//span[text()='FIRST_PRP']")).getText();
       Assert.assertEquals(actualResultsProduct2, expectedResultsProduct2);


   }
    }