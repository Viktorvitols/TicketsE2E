import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.BaseFunc;
import pages.BookingPage;
import pages.HomePage;

public class TicketsTestPO {

    private BaseFunc baseFunc = new BaseFunc();

    @Test
    public void poTest() {
        // open page
        baseFunc.goToUrl("http://qaguru.lv:8089/tickets/");

        HomePage homePage = new HomePage(baseFunc);
        String brandNameHP = homePage.getBrandNameHP();


        homePage.selectDirect();
        homePage.pressGoGoGo();
        BookingPage bookingPage = new BookingPage(baseFunc);
        String brandNameBP = bookingPage.getBrandNameBP();

//        Assertions.assertEquals(brandNameHP, brandNameBP, "not equal" );


    }
}
