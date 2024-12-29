package magazin;

public class Chocolate extends Product{
    private String weight;
    public Chocolate(int barcode,String productName,float price,String weight){
        super(barcode,productName,price);
        this.weight=weight;
    }

    public String getWeight() {
        return weight;
    }
    @Override
    public String getInfo(){
        return super.getInfo() +
                "  Greutatea :: " + this.weight + "\n";
    }
}
