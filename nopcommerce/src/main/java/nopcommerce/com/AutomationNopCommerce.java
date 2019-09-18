package nopcommerce.com;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutomationNopCommerce extends Utils
{
    LoadProps loadProp = new LoadProps();
    @BeforeMethod
    public void opensTheChromeBrowser()
    {
        opensChromeBrowser();
        driver.get(loadProp.getProperty("url"));
    }
    @AfterMethod
    public void closesTheChromeBroswer1()
    {
        closesTheChromeBroswer();
    }
    @Test(priority = 0)
    public void userShouldBeAbleToRegisterSuccessfully()
    {
        //click on register
        clickElement(By.xpath("//a[@class='ico-register']"));
        //enter First Name
        enterText(By.id("FirstName"), loadProp.getProperty("FirstName1"));
        //enter Last Name
        enterText(By.xpath("//input[@name=\"LastName\" or id=\"LastName\"]"), loadProp.getProperty("LastName1"));
        //Select Date of birth
        selectByIndexValue(By.xpath("//select[@name=\"DateOfBirthDay\"]"), 16);
        //Select Month of birth
        selectByVisibleText(By.xpath("//select[@name=\"DateOfBirthMonth\"]"), "July");
        //Select Year of birth
        selectByVisibleValue(By.xpath("//select[@name=\"DateOfBirthYear\"]"), "1998");
        //generating email addresses
        enterText(By.name("Email"), loadProp.getProperty("EmailName1") + randomDate() + loadProp.getProperty("EmailFormat1"));
        //enter password
        enterText(By.xpath("//input[@data-val-required=\"Password is required.\" and @id=\"Password\"]"), loadProp.getProperty("Password1"));
        //confirm password
        enterText(By.name("ConfirmPassword"), loadProp.getProperty("Password1"));
        //click on Registration button
        clickElement(By.className("register-next-step-button"));
        //Expected Result
        String expectedResult1 = loadProp.getProperty("TestDataRegistrationCompleteMessage1");
        //Actual Result
        String actualResult1 = getTextFromElement(By.xpath("//div[@class='result']"));
        //Assertion, comparing expected with the actual
        Assert.assertEquals(expectedResult1,actualResult1);
    }
    @Test (priority = 1)
    public void userShouldBeAbleToReferAProductToAFriend()
    {
        //click on register
        clickElement(By.xpath("//a[@class='ico-register']"));
        //enter First Name
        enterText(By.id("FirstName"), loadProp.getProperty("FirstName1"));
        //enter Last Name
        enterText(By.xpath("//input[@name=\"LastName\" or id=\"LastName\"]"), loadProp.getProperty("LastName1"));
        //Select Date of birth
        selectByIndexValue(By.xpath("//select[@name=\"DateOfBirthDay\"]"), 16);
        //Select Month of birth
        selectByVisibleText(By.xpath("//select[@name=\"DateOfBirthMonth\"]"), "July");
        //Select Year of birth
        selectByVisibleValue(By.xpath("//select[@name=\"DateOfBirthYear\"]"), "1991");
        //generating email addresses
        enterText(By.name("Email"), loadProp.getProperty("EmailName1") + randomDate() + loadProp.getProperty("EmailFormat1"));
        //enter password
        enterText(By.xpath("//input[@data-val-required=\"Password is required.\" and @id=\"Password\"]"), loadProp.getProperty("Password1"));
        //confirm password
        enterText(By.name("ConfirmPassword"), loadProp.getProperty("Password1"));
        //click on Registration button
        clickElement(By.className("register-next-step-button"));
        //click on Continue button
        clickElement(By.className("register-continue-button"));
        //click on Computers from navigation bar
        clickElement(By.xpath("//ul[@class=\"top-menu notmobile\"] //a[@href=\"/computers\"]"));
        //then click on Notebook
        clickElement(By.linkText("Notebooks"));
        //Click on Apple MacBook product
        clickElement(By.linkText("Apple MacBook Pro 13-inch"));
        //click on Email a friend button
        clickElement(By.xpath("//input[@value=\"Email a friend\"]"));
        //Enter Friend's Email Address
        enterText(By.cssSelector("input[class=friend-email]"), loadProp.getProperty("FriendsEmailAddress") + randomDate() + loadProp.getProperty("EmailFormat1"));
        //Enter a message
        enterText(By.xpath("//*[@id=\"PersonalMessage\"]"), loadProp.getProperty("MessageForAFriend"));
        //click on send email
        clickElement(By.className("send-email-a-friend-button"));
        //Expected Result
        String expectedResult2 = loadProp.getProperty("MessageSentToAFriend");
        // Actual Result
        String actualResult2 = getTextFromElement(By.xpath("//div[@class='result']"));
        //comparing expected with actual
        Assert.assertEquals(actualResult2,expectedResult2);
    }
    @Test (priority = 2)
    public void userShouldBeAbleToNavigateToCameraAndPhotoPage()
    {
        //clicking on Electronics page
        clickElement(By.linkText("Electronics"));
        //clicking on Camera and Photo page
        clickElement(By.linkText("Camera & photo"));
        //Expected Result
        String expectedResult3 = loadProp.getProperty("CameraAndPhotoPage");
        //Actual Result
        String actualResult3 = getTextFromElement(By.tagName("h1"));
        //comparing expected with actual
        Assert.assertEquals(actualResult3,expectedResult3);
    }
    @Test (priority = 3)
    public void userShouldBeAbleToSelectJewellery() {
        //click on Jewellery Page
        clickElement(By.linkText("Jewelry"));
        //filter products chosen 700-3000
        clickElement(By.xpath("//a[@href=\"//demo.nopcommerce.com/jewelry?price=700-3000\"]"));
        //Expected Result
        String expectedResult4 = loadProp.getProperty("JewellerySpelling");
        //Actual Result
        String actualResult4 = getTextFromElement(By.tagName("h1"));
        //Comparing Expected and Actual
        Assert.assertEquals(actualResult4, expectedResult4);
    }
    @Test (priority = 4)
    public void userShouldBeAbleToSelectJewelleryByPrice()
    {
        //Click on the Jewellery Page
        clickElement(By.linkText("Jewelry"));
        //Filter price $700-$3000
        clickElement(By.xpath("//a[@href=\"//demo.nopcommerce.com/jewelry?price=700-3000\"]"));

        //Path for Minimum Range
        String minrange = getTextFromElement(By.xpath("//span[@class=\"PriceRange\"][1]"));
        //replacing $ sign
        String minrange1 = String.valueOf(minrange.replace("$", ""));
        //converting double to int
        double minrange2 = Double.valueOf(minrange1);

        //Path for Maximum range
        String maxrange = getTextFromElement(By.xpath("//span[@class=\"PriceRange\"][2]"));
        //replacing $ sign
        String maxrange1 = String.valueOf(maxrange.replace("$",""));
        //converting double to int
        double maxrange2 = Double.valueOf(maxrange1);

        //Expected Result
        String value = getTextFromElement(By.xpath("//span[@class=\"price actual-price\"]"));
        String replacevalue1 = String.valueOf(value.replace("$", ""));
        String replacevalue2 = String.valueOf(replacevalue1.replace(",", ""));
        double myvalue3 = Double.valueOf((replacevalue2));

        //comparing expected with actual
        Assert.assertTrue(myvalue3 >= minrange2 && myvalue3 <= maxrange2);
    }
    @Test (priority = 5)
    public void userShouldBeAbleToAddTheItemsInTheBasket()
    {
        //click on Books category
        clickElement(By.linkText("Books"));
        //Click on the product - clicked on Fahrenheit 451
        clickElement(By.linkText("Fahrenheit 451 by Ray Bradbury"));
        //add product to the cart
        clickElement(By.id("add-to-cart-button-37"));
        //going back to add another product
        navigateBackChromeWindow();
        //selecting another product
        clickElement(By.linkText("First Prize Pies"));
        //addding another product to the cart
        clickElement(By.id("add-to-cart-button-38"));
        //closing the green bar that appears at the top which shows products added in the cart
        clickElement(By.className("close"));
        //click on the shopping cart to see what items have been added in the cart
        clickElement(By.linkText("Shopping cart"));
        //actual result
        String actualbookFR1 = getTextFromElement(By.xpath("//span[text()='FR_451_RB']"));
        //expected result
        String expectedbookFR1 = "FR_451_RB";
        Assert.assertEquals(actualbookFR1,expectedbookFR1);
        String actualbookPRP1 = getTextFromElement(By.xpath("//span[text()='FIRST_PRP']"));
        String expectbookPRP1= "FIRST_PRP";
        Assert.assertEquals(actualbookPRP1,expectbookPRP1);
    }
}
