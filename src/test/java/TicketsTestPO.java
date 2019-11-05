import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.*;

public class TicketsTestPO {

    private BaseFunc baseFunc = new BaseFunc();
    private HomePage homePage = new HomePage(baseFunc);
    private BookingPage bookingPage = new BookingPage(baseFunc);
    private FillInForm fillInForm = new FillInForm(baseFunc);
    private Seats seats = new Seats(baseFunc);

    @Test
    public void poTest() {
        // open page
        baseFunc.goToUrl("http://qaguru.lv:8089/tickets/");

        String brandNameHP = homePage.getBrandNameHP();

        homePage.selectDirect();
        String dirAName = homePage.getDirAName();
        String dirBName = homePage.getDirBName();
        homePage.pressGoGoGo();

        String brandNameBP = bookingPage.getBrandNameBP();

//        Assertions.assertEquals(brandNameHP, brandNameBP, "not equal" );

        String fromA = bookingPage.getDestinationA();
        String destB = bookingPage.getDestinationB();


//        Assertions.assertEquals(dirAName, fromA, "Selection 'from' doesn't match");
        Assertions.assertEquals(dirBName, destB, "Selection 'to' doesn't match");

        fillInForm.fillInFields();

        bookingPage.book();
        seats.seatSelect();
        seats.book();


//        baseFunc.close();
    }
}
