public class TestPosition
{
    public static void main(String[] args){
        Torch aTorch = new Torch();
        System.out.println("Charge:2 hours");
        aTorch.charge(2);
        System.out.println("First Turn on: 3 hours");
        aTorch.turnOn(3);
        System.out.println("Second turn on: 3 hours");
    }
}