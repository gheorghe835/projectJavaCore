import magazin.Product;

public class Wine extends Product {
    private String volum;
    public static final int COVERCHARGE = 10;
    public Wine(int barcode,String productName,float price,String volum ){
        super(barcode,productName,price);
        this.volum = volum;

    }
    public String getVolume() {
        return volum;
    }
    public float countPriceFinal() {
        return super.finalPrice()*(100+COVERCHARGE)/100;
    }
    @Override
    public String getInfo(){
        return  "  Codul productului :: " + this.getBarcode() + "\n" +
                "  Denumirea  :: " + this.getProductName() +
                "  Pretul  :: " + this.countPriceFinal() + " lei " +
                "  Volumul productului :: " + this.getVolume() + "\n";
    }

}
