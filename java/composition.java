public class composition
{
    public static void main(String[] args){
        Torch aTorch = new Torch();
        System.out.println("Charge:6 hours");
        aTorch.charge(6);
        System.out.println("First Turn on: 3 hours");
        aTorch.turnOn(3);
        System.out.println("Second turn on: 5 hours");
        aTorch.turnOn(5);
    }
}

class Battery
{
    public double power = 0.0;
    public void chargeBattery(double p){
        if(this.power < 1.){
            this.power = this.power + p;
        }
    }
    public boolean useBattery(double p){
        if (this.power>= p){
            this.power = this.power - p;
            return true;
        }else{
            this.power = 0.0;
            return false;
        }
        
        
    }
}

class Torch
{
    private Battery theBattery = new Battery();
    public void turnOn(int hours){
        boolean usable;
        //Warning when the power of battery low to 10%;
        usable = this.theBattery.useBattery(hours*0.1);
        if (usable!= true){
            System.out.println("No more usable,must charge");
        }
    }
    public void charge(int hours){
        this.theBattery.chargeBattery(hours*0.1);
    }
}