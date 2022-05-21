import junit.framework.TestCase;
import org.junit.Test;

public class CoffeeMachineTest extends TestCase {
    @Test
    public void test1() {
        CoffeeMachine test1 = new CoffeeMachine();
        assertEquals("Power On!" + "Lights On!", test1.MachineOn());
    }

    @Test
    public void test2() {
        CoffeeMachine test2 = new CoffeeMachine();
        test2.isWorking = true;
        assertEquals("Machine Already On", test2.MachineOn());
    }

    @Test
    public void test3() {
        CoffeeMachine test3 = new CoffeeMachine();
        assertEquals("Please turn the machine first", test3.InsertMoney(30));
    }

    @Test
    public void test4() {
        CoffeeMachine test4 = new CoffeeMachine();
        assertEquals("Power On!" + "Lights On!", test4.MachineOn());
        assertEquals("money received", test4.InsertMoney(30));
    }

    @Test
    public void test5() {
        CoffeeMachine test5 = new CoffeeMachine();
        test5.MachineOn();
        assertEquals("Machine Already On", test5.MachineOn());
        assertEquals("Lights Off"+"Power Off" , test5.MachineOff());
        assertEquals("Please turn the machine first", test5.InsertMoney(30));
    }
    @Test
    public void test6() {
        CoffeeMachine test6 = new CoffeeMachine();
        assertEquals("4"+ " Cups Of coffee Made!", test6.OrderCoffee(4,30));
    }
    @Test
    public void test8() {
        CoffeeMachine test8 = new CoffeeMachine();
        assertEquals("Power On!" + "Lights On!", test8.MachineOn());
        assertEquals("money received", test8.InsertMoney(50));
        assertEquals("10"+ " Cups Of coffee Made!", test8.OrderCoffee(10,50));

    }
}