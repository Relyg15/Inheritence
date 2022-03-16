public class Burger extends Food{
    private double pound;
    private String bread;
    public Burger(boolean eat, int cost, double meat, String bread){
        super(eat, cost);
        pound = meat;
        this.bread = bread;
    }
    public void breadType(){
        System.out.println("The burger has " + bread + " buns");
    }
    public void weightMeat(){
        System.out.println("The burger is " + pound + " pound(s)");
    }

}
