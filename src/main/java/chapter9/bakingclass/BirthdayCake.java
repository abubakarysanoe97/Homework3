package chapter9.bakingclass;

public class BirthdayCake extends Cake {
   private int candle;

   public BirthdayCake(String flavor ) {
      super(flavor);
   }

   public int getCandle() {
      return candle;
   }

   public void setCandle(int candle) {
      this.candle = candle;
   }
}
