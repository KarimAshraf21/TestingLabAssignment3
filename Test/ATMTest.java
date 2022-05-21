import junit.framework.TestCase;
import org.junit.Test;
public class ATMTest extends TestCase {
    @Test
    public void test1() {
        ATM test1 = new ATM();
        test1.CardIsValid = false;
        assertEquals("Card is not valid", test1.ValidateCard());
    }
    @Test
    public void test2() {
        ATM test2 = new ATM();

        assertEquals("Card is valid", test2.ValidateCard());
    }
    @Test
    public void test3() {
        ATM test3 = new ATM();
        assertEquals("Welcome", test3.enterPassword());
    }
    @Test
    public void test4() {
        ATM test4 = new ATM();
        assertEquals("Card is valid", test4.ValidateCard());
        test4.PasswordIsValid = false;
        assertEquals("Please enter a valid password", test4.enterPassword());
    }
    @Test
    public void test5() {
        ATM test5 = new ATM();
        assertEquals("Card is valid", test5.ValidateCard());
        assertEquals("No enough balance", test5.withdrawCash(10));
        assertEquals("Welcome", test5.enterPassword());
    }
    @Test
    public void test6() {
        ATM test6 = new ATM();
        assertEquals("Card is valid", test6.ValidateCard());
        assertEquals("Welcome", test6.enterPassword());
        assertEquals("You can't deposit money less than 50 or more than 20000", test6.depositCash(10));
        assertEquals("No enough balance", test6.withdrawCash(10));
    }
    @Test
    public void test7() {
        ATM test7 = new ATM();
        assertEquals("Card is valid", test7.ValidateCard());
        assertEquals("Welcome", test7.enterPassword());
        assertEquals("cash deposited successfully", test7.depositCash(50));
        assertEquals("No enough balance", test7.withdrawCash(70));
    }
    @Test
    public void test8() {
        ATM test8 = new ATM();
        assertEquals("Card is valid", test8.ValidateCard());
        assertEquals("Welcome", test8.enterPassword());
        assertEquals("cash deposited successfully", test8.depositCash(1000));
        assertEquals("Successful withdraw", test8.withdrawCash(10));
    }
    @Test
    public void test9() {
        ATM test9 = new ATM();
        assertEquals("Card is valid", test9.ValidateCard());
        assertEquals("Welcome", test9.enterPassword());
        assertEquals("You can't deposit money less than 50 or more than 20000", test9.depositCash(230000));
        assertEquals("No enough balance", test9.withdrawCash(10));
    }
    @Test
    public void test10() {
        ATM test10 = new ATM();
        assertEquals("Card is valid", test10.ValidateCard());
        assertEquals("Welcome", test10.enterPassword());
        assertEquals("You can't deposit money less than 50 or more than 20000", test10.depositCash(230000));
        assertEquals("No enough balance", test10.withdrawCash(10));
        assertEquals("cash deposited successfully", test10.depositCash(90));
        assertEquals("Successful withdraw", test10.withdrawCash(50));
    }
}