public class TidalWave {

    private int price;
    private int minAge;
    private int minHeight;


    public TidalWave(int price, int minAge, int minHeight) {
        this.price = price;
        this.minAge = minAge;
        this.minHeight = minHeight;
    }

    public int getPrice(){return this.price;}
    public int getMinAge(){return this.minAge;}
    public int getMinHeight(){return this.minHeight;}

}
