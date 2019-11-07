package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BookingPage {
    private BaseFunc baseFunc;

    private final By TITLE = By.xpath(".//div[@class = 'toolbar']");
    private final By RESPONSE = By.id("response");
    private final By RESPONSE_CHILDREN = By.xpath(".//span[@class = 'bTxt']");
    private final By BOOK2BTN = By.id("book2");

    public BookingPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public String getBrandNameBP() {
        return baseFunc.getText(TITLE);
    }

    public String getDirAName() {
        WebElement dirAName = baseFunc.getElements(RESPONSE_CHILDREN).get(0);
        return dirAName.getText();
    }

    public String getDirBName() {
        WebElement dirBName = baseFunc.getElements(RESPONSE_CHILDREN).get(1);
        return dirBName.getText();
    }

    public void book() {
        baseFunc.click(BOOK2BTN);
    }

    public String getNameResponse() {
        List<WebElement> nameWE = baseFunc.getChildElements(RESPONSE, RESPONSE_CHILDREN);
        String name = nameWE.get(0).getText();
        return name.substring(0, name.length() - 1);
    }

    public String getDirANameResponse() {
        List<WebElement> dirAName = baseFunc.getChildElements(RESPONSE, RESPONSE_CHILDREN);
        return dirAName.get(1).getText();
    }

    public String getDirBNameResponse() {
        List<WebElement> dirBName = baseFunc.getChildElements(RESPONSE, RESPONSE_CHILDREN);
        return dirBName.get(2).getText();
    }


}