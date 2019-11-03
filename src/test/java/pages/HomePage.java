package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
    private BaseFunc baseFunc;

    private final By TITLE = By.xpath(".//div[@class = 'toolbar']");
    private final By DIRECTION_A = By.id("afrom");
    private final By DIRECTION_B = By.id("bfrom");
    private final By GOGOGO = By.xpath(".//span[@class = 'gogogo']");

    public HomePage (BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }


    public String getBrandNameHP() {
        //Find element
        //save to string
        return baseFunc.getElement(TITLE).getText();

    }

    public void selectDirect(){
        Select directionA = new Select(baseFunc.getElement(DIRECTION_A));
        directionA.selectByValue("HAK");

        Select directionB = new Select(baseFunc.getElement(DIRECTION_B));
        directionB.selectByValue("RIX");
    }

    public String getDirAName() {
        Select select = new Select(baseFunc.getElement(DIRECTION_A));
        return select.getFirstSelectedOption().getText();
    }
    public String getDirBName() {
        Select select = new Select(baseFunc.getElement(DIRECTION_B));
        return select.getFirstSelectedOption().getText();
    }

    public void pressGoGoGo(){
        baseFunc.getElement(GOGOGO).click();
    }

}
