package pages;

import org.openqa.selenium.By;

public class Seats {
    private BaseFunc baseFunc;

    private final By SEAT = By.xpath(".//div[@class = 'seat']");
    private final By BOOK3 = By.id("book3");
    private final By SEAT_NR_RESPONSE = By.xpath(".//div[@class = 'line']");


    public Seats(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void seatSelect() {
        baseFunc.click(SEAT);
    }

    public String getSeatNr() {
        return baseFunc.getText(SEAT);
    }

    public String getSeatResponse() {
        String line = baseFunc.getText(SEAT_NR_RESPONSE);
        String[] parts = line.split(" ");
        return parts[3];
    }

    public void book() {
        baseFunc.click(BOOK3);
    }
}
