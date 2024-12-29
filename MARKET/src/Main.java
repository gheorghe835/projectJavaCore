import magazin.Chocolate;
import magazin.Product;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1," Apa Minerala ",4.55f);
        System.out.println(product1.toString());
        Product product2 = new Product(2,"  Biscuiti de casa ",22.8f);
        System.out.println(product2.toString());
        Product product3 = new Product(7,"  Franzela ",8.1f);
        System.out.println(product3.toString());
        Wine wine1 = new Wine(246802,"  Vin de Cricova",55.5f,"  700 ml.");
        System.out.println(wine1.toString());
        Wine wine2 = new Wine(135791,"  Vin pastoral ",39.5f,"  1L.");
        System.out.println(wine2.toString());
        Wine wine3 = new Wine(875421,"  Vin de Purcari ",299.99f,"  0.75L.");
        System.out.println(wine3.toString());
        Chocolate chocolate1 = new Chocolate(102468,"  Pasarea Maiastra", 55.5f,"  500 gr.");
        System.out.println(chocolate1.toString());
        Chocolate chocolate2 = new Chocolate(427129,"  Brindusa ",154.4f,"  1kg.");
        System.out.println(chocolate2.toString());
        Chocolate chocolate3 = new Chocolate(193728,"  Chisinaul de Seara ", 198f," 750 gr.");
        System.out.println(chocolate3.toString());
    }
}