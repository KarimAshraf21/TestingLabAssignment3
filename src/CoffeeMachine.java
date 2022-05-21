public class CoffeeMachine {
    public boolean LightIsOn = false;
    public boolean isMakingCoffee = false;
    public int amount;
    public boolean isWorking = false;
    private final float price = 5;
    public String InsertMoney(int m){
        if(isWorking ==true) {
            this.amount = m;
            return "money received";
        }
        else{
            return "Please turn the machine first";
        }
    }
    public String MachineOn(){
        if(isWorking ==false) {
            isWorking = true;
            LightIsOn = true;
            return "Power On!" + "Lights On!";

        }
        else{
            return "Machine Already On";
        }
    }
    public String MachineOff(){
        if(isWorking ==true) {
            LightIsOn = false;
            isWorking = false;
            return "Lights Off" + "Power Off";
        }
        else{
            return "Machine Already Off";
        }

    }
    public String OrderCoffee(int quantity,int money){
        int count= 0;
        this.amount =money;
        if ((money) >= (price)) {
            while(money>= price && quantity > 0){
                money -= price;
                isMakingCoffee = true;
                quantity --;
                count++;
            }
        }
        else {
            return "Not enough Money to make "+count+" cups";
        }
        isMakingCoffee = false;
        return count+ " Cups Of coffee Made!";
    }
}
