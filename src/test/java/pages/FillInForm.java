package pages;

import org.openqa.selenium.By;

public class FillInForm {
    private BaseFunc baseFunc;

    private final By NAME = By.id("name");
    private final By SURNAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULTS = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By BAGS = By.id("bugs");
    private final By FLIGHT = By.id("flight");
    private final By GETPRICE = By.xpath(".//span[@onclick = 'setLang();']");


    public FillInForm(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    String name = "Viktor";

    public String getName() {
        return this.name;
    }

    public void fillInFields() {
        baseFunc.inputText(NAME, name);
        baseFunc.inputText(SURNAME, "Vitols");
        baseFunc.inputText(DISCOUNT, "50%");
        baseFunc.inputText(ADULTS, "1");
        baseFunc.inputText(CHILDREN, "0");
        baseFunc.inputText(BAGS, "0");
        baseFunc.selectIndex(FLIGHT, 1);

        baseFunc.click(GETPRICE);
    }
}
