package pages;

import org.openqa.selenium.By;

public class BookingPage {

    private BaseFunc baseFunc;

    private final By TITLE = By.xpath(".//div[@class = 'toolbar']");
    private final By DESTINATION = By.xpath(".//span[@class = 'bTxt']");


    public BookingPage (BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public String getBrandNameBP() {
        return baseFunc.getElement(TITLE).getText();

    }

    public String getDestination() {
        return baseFunc.getElements()
    }


}
