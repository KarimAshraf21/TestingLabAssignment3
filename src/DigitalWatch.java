public class DigitalWatch {
    public boolean isActive = false;
    public boolean Timer = false;
    public float timer = 0;

    public String Open(){
        if(isActive==false){
            isActive = true;
            return "Welcome!";
        }
        else{
            return  "Already turned on";
        }
    }
    public String setTimer(float time){
        if(isActive==true){
            timer = time;
            Timer = true;
            return "Timer starts now";
        }
        else{
            return "Watch is closed open first";
        }
    }
    public String TurnOff(){
        if(isActive==true){
            isActive = false;
            return "Turned off";
        }
        else{
            return "Watch is Already off";
        }
    }
}
