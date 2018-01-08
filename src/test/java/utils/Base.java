package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    public static long wait=30;
    public static WebDriver driver;
    public static boolean isElementVisible(WebElement element)
    {
        try{
            if(element.isDisplayed())
                return true;
            return false;
        }
        catch (org.openqa.selenium.NoSuchElementException e)
        {
            System.out.println(e);
            return false;
        }

    }



    public static void sleep(int timeout){
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    public static void waitForElementToBeInvisible(WebElement element)
    {
        WebDriverWait wwait = new WebDriverWait(driver,wait);
        wwait.until(invisibilityOfWebElementLocated(element));
    }

    public static void waitUntilElementIsVisible(WebElement element){
        WebDriverWait wwait = new WebDriverWait(driver,wait);
        wwait.until(ExpectedConditions.visibilityOf(element));
    }

    private static ExpectedCondition<Boolean> invisibilityOfWebElementLocated(final WebElement element)
    {
        return new ExpectedCondition<Boolean>() {
            //@Override
            public Boolean apply(WebDriver driver) {
                try
                {
                    if (element.isDisplayed())
                        return false;
                    return true;
                }
                catch (Exception e)
                {
                    return true;
                }
            }
        };
    }


    public static void mouseHoverAndClickElement(WebElement srcElement, WebElement targetElement){
        Actions action = new Actions(driver);
        action.moveToElement(srcElement).perform();
        action.moveToElement(targetElement);
        action.click();
        action.perform();
    }

    public static void mouseHoverOnElement(WebElement srcElement){
        Actions action = new Actions(driver);
        action.moveToElement(srcElement).perform();
    }
}
