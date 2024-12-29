package magazin;

public class Product {
    private int barcode;
    private String productName;
    private float price;
    public static final int RATETVA = 20;

    public int getBarcode() {
        return barcode;
    }

    public String getProductName() {
        return productName;
    }
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float finalPrice(){
        return price*(100+RATETVA)/100;
    }
    public Product(){}
    public Product(int barcode,String productName,float price){
        this.barcode=barcode;
        this.productName=productName;
        this.price=price;
    }
    public String getInfo(){
        return  "  Codul productului :: " + this.barcode + "\n" +
                "  Denumirea :: " + this.productName +
                "  Pretul :: " + this.finalPrice() + " lei." + "\n";
    }
}
