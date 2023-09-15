package chapter9.bakingclass;

public class TasteTester {
    public static int addValue (int a, int b){
        int total = a + b;
       return total;

    }
    public static void main(String[] args) {
        BirthdayCake birthdayCake = new BirthdayCake("Mango");
        WeddingCake weddingCake = new WeddingCake("Grape");
        birthdayCake.setCandle(5);
        birthdayCake.setPrice(50);
        weddingCake.setTier(10);
        System.out.println(birthdayCake.getFlavor() +" This Cost $" + birthdayCake.getPrice());
        System.out.println(weddingCake.getFlavor() + " This Cost $" + weddingCake.getPrice());


    }
}
