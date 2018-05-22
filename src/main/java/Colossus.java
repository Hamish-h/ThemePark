public class Colossus {

    private int price;
    private int minAge;
    private int minHeight;


    public Colossus(int price, int minAge, int minHeight) {
        this.price = price;
//        super(price);
        this.minAge = minAge;
        this.minHeight = minHeight;
    }

    public int getPrice(){return this.price;}
    public int getMinAge(){return this.minAge;}
    public int getMinHeight(){return this.minHeight;}

}

