import org.junit.Test;
import static org.junit.Assert.*;
public class DigitalWatchTest {
    @Test
    public void test1(){
        DigitalWatch test1 = new DigitalWatch();
        assertEquals("Welcome!",test1.Open());
    }
    @Test
    public void test2(){
        DigitalWatch test2 = new DigitalWatch();
        assertEquals("Watch is closed open first",test2.setTimer(94));
    }
    @Test
    public void test3(){
        DigitalWatch test3 = new DigitalWatch();
        assertEquals("Watch is Already off",test3.TurnOff());
    }
    @Test
    public void test4(){
        DigitalWatch test4 = new DigitalWatch();
        assertEquals("Welcome!",test4.Open());
        assertEquals("Already turned on",test4.Open());
    }
    @Test
    public void test5(){
        DigitalWatch test5 = new DigitalWatch();
        assertEquals("Welcome!",test5.Open());
        assertEquals("Already turned on",test5.Open());
        assertEquals("Turned off",test5.TurnOff());
    }
    @Test
    public void test6(){
        DigitalWatch test6 = new DigitalWatch();
        assertEquals("Welcome!",test6.Open());
        assertEquals("Timer starts now",test6.setTimer(7));
    }
    @Test
    public void test7(){
        DigitalWatch test7 = new DigitalWatch();
        assertEquals("Welcome!",test7.Open());
        assertEquals("Timer starts now",test7.setTimer(9));
        assertEquals("Turned off",test7.TurnOff());
    }

}