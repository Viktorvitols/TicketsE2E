package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

public class BaseFunc {

    private WebDriver driver;

    public BaseFunc() {
        System.setProperty("webdriver.gecko.driver", "c:/drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    public void goToUrl(String url) {
        if (url.startsWith("http://") || url.startsWith("https://")) {
        } else {
            url = "http://" + url;
        }
        driver.get(url);
    }

    public WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    public List<WebElement> getElements(By locator) {
        return driver.findElements(locator);
    }

//    public WebElement getChildElement(By locatorParent, int i, By locatorChild, int ii) {
//        WebElement parentElement;
//        WebElement childElement;
//
//        List<WebElement> parentElements = driver.findElements(locatorParent);
//        if (!parentElements.isEmpty()) {
//            parentElement = parentElements.get(i);
//            List<WebElement> childElements = parentElement.findElements(locatorChild);
//            if (!childElements.isEmpty()) {
//                childElement = childElements.get(ii);
//            } else {
//                System.out.println("Child element does not exist");
//            }
//        } else {
//            System.out.println("Parent element does not exist");
//        }
//        return childElement;
//    }

    public List<WebElement> getChildElements(By locatorParent, By locatorChild) {

        Assertions.assertFalse(driver.findElements(locatorParent)
                .isEmpty(), "No Parent Element");
        Assertions.assertFalse(driver.findElement(locatorParent)
                .findElements(locatorChild)
                .isEmpty(), "No child elements");

        return driver.findElement(locatorParent).findElements(locatorChild);
    }

    public void inputText(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    public WebElement selectVisible(By locator) {
        Select select = new Select(getElement(locator));
        return select.getFirstSelectedOption();
    }

    public void selectIndex(By locator, int index) {
        Select select = new Select(getElement(locator));
        select.selectByIndex(index);
    }

    public void click(By locator) {
        getElement(locator).click();
    }


    //-------- Close browser --------
    public void close() {
        driver.close();
    }
}