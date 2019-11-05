package pages;

import org.openqa.selenium.By;

public class Seats {
    private BaseFunc baseFunc;

    private final By SEAT = By.xpath(".//div[@class = 'seat']");
    private final By BOOK3 = By.id("book3");


    public Seats(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void seatSelect() {
        baseFunc.click(SEAT);
    }

    public void book(){
        baseFunc.click(BOOK3);
    }



}
