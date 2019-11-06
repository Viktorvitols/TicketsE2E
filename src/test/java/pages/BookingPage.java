package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BookingPage {
    private BaseFunc baseFunc;

    private final By TITLE = By.xpath(".//div[@class = 'toolbar']");
    private final By DESTINATION = By.xpath(".//span[@class = 'bTxt']");
    private final By BOOK2BTN = By.id("book2");

    public BookingPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public String getBrandNameBP() {
        return baseFunc.getElement(TITLE).getText();
    }

    public String getDirAName() {
        WebElement DirAName = baseFunc.getElements(DESTINATION).get(0);
        return DirAName.getText();
    }

    public String getDirBName() {
        WebElement DirBName = baseFunc.getElements(DESTINATION).get(1);
        return DirBName.getText();
    }

    public void book() {
        baseFunc.click(BOOK2BTN);
    }


}