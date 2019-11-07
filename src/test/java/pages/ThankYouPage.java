package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ThankYouPage {
    private BaseFunc baseFunc;

    //    private final By TITLE1 = By.xpath(".//span[@class = 'ryan']");
    //    private final By TITLE2 = By.xpath(".//span[@class = 'baltic']");
    private final By TITLE = By.xpath(".//a[@href]");
    private final By TITLE1 = By.xpath(".//span[@class]");


    public ThankYouPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public String getBrandNameTP() {
        List<WebElement> elements = baseFunc.getChildElements(TITLE, TITLE1);
        return elements.get(0).getText();
    }

    public String getBrandNameTP1() {
        return baseFunc.getText(TITLE);
    }

}
