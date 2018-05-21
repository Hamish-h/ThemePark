public class Colossus extends Ride {

    private int price;
    private int minAge;
    private int minHeight;


    public Colossus(int minAge, int minHeight) {
//        this.price = price;
        this.minAge = minAge;
        this.minHeight = minHeight;
    }

//    public int getPrice(){return this.price;}
    public int getMinAge(){return this.minAge;}
    public int getMinHeight(){return this.minHeight;}

}

