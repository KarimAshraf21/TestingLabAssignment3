public class ATM {
    public float User_Balance = 0;
    public boolean CanMakeTransaction = false;
    public boolean CardIsValid = true;
    public boolean PasswordIsValid = true;
    public String ValidateCard() {
        if (CardIsValid) {
            return "Card is valid";
        } else {
            return "Card is not valid";
        }
    }
    public String enterPassword() {
        if (PasswordIsValid == true) {
            CanMakeTransaction = true;
            return "Welcome";
        } else {
            return "Please enter a valid password";
        }
    }
    public String depositCash(float Amount){
        if (Amount >= 50 && Amount <= 20000) {
            User_Balance += Amount;
            return "cash deposited successfully";
        } else {
            return "You can't deposit money less than 50 or more than 20000";
        }
    }
    public String withdrawCash(float amount){
        if (amount < User_Balance) {
            User_Balance -= amount;
            return "Successful withdraw";
        } else {
            return "No enough balance";
        }
    }
}
