public class HotDog extends Food {
   private int length;
   private String meatType;
   public HotDog(int cost,boolean eatFood, String meat, int len ){
       super(eatFood, cost);
       length = len;
       meatType = meat;
   }
   public void howLong()
   {
       System.out.println("The hotdog is " + length + " inches long");
   }
   public void whatMeat(){
       System.out.println("The meat used in the hotdog is " + meatType);
   }
}
