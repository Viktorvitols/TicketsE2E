package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BookingPage {
    private BaseFunc baseFunc;

    private final By TITLE = By.xpath(".//div[@class = 'toolbar']");
    private final By DESTINATION = By.xpath(".//span[@class = 'bTxt']");
    private final By BOOK2 = By.id("book2");



    public BookingPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public String getBrandNameBP() {
        return baseFunc.getElement(TITLE).getText();
    }

    public String getDestinationA() {
        WebElement fromA = baseFunc.getElements(DESTINATION).get(0);
        return fromA.getText();
    }

    public String getDestinationB() {
        WebElement destB = baseFunc.getElements(DESTINATION).get(1);
        return destB.getText();
    }

    public void book(){
        baseFunc.click(BOOK2);
    }


}
