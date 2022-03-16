public class Food {
    private boolean eatFood;
    private int cost;
    public Food(boolean eat, int c){
        eatFood = eat;
        cost = c;
    }
    public void eating(){
        if (eatFood) System.out.print("Hmmm that's some good food");
        else{System.out.println("I am hungry for some food");}
    }
    public void countCost(){
        System.out.println("The food costs " + cost);
    }

    public static void main(String[] args) {
        Food f  = new Food(true, 24);
        f.eating() ;
        f.countCost();

        Burger mick = new Burger(true, 15, .75, "beef");
        mick.countCost();
        mick.breadType();
        mick.eating();
        mick.weightMeat();
        HotDog ralph = new HotDog(7, true, "Turkey", 7);
        ralph.howLong();
        ralph.whatMeat();
        ralph.countCost();
        ralph.eating();
    }
}
