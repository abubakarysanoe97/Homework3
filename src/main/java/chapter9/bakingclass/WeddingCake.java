package chapter9.bakingclass;

public class WeddingCake extends Cake {
    private int tier;

    public WeddingCake(String flavor) {
        super(flavor);
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }
}

