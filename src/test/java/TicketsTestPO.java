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
        String dirAName = homePage.getDirAName();
        String dirBName = homePage.getDirBName();
        homePage.pressGoGoGo();

        BookingPage bookingPage = new BookingPage(baseFunc);
        String brandNameBP = bookingPage.getBrandNameBP();

//        Assertions.assertEquals(brandNameHP, brandNameBP, "not equal" );

        String fromA = bookingPage.getDestinationA();
        String destB = bookingPage.getDestinationB();


//        Assertions.assertEquals(dirAName, fromA, "Selection 'from' doesn't match");
        Assertions.assertEquals(dirBName, destB, "Selection 'to' doesn't match");



    }
}
