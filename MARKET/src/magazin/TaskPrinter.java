package magazin;

public class TaskPrinter {
    public static void main(String[] args) {
        System.out.println("Create a simpler store information system. In the Java program, products should be presented " +
                "using three classes: Product, Wine and Chocolate. The Product class should be used for general presentation " +
                "of products that do not have a special type. In the program, two special types of products must also be modeled," +
                " so the Product class must be inherited by two classes representing concrete groups of products: Chocolate and " +
                "Wine. This hierarchy, shown graphically, looks like this:\n" +
                "Each product (Product class) must have certain characteristics:\n" +
                "- product name;\n" +
                "- bar code;\n" +
                "- base price;\n" +
                "- tax.\n" +
                "Each product (Product class) must also have a method for calculating the price. The price is calculated by " +
                "increasing the base price by the amount of tax. The tax (VAT) for each product is 20% and this is constant and will not change.\n" +
                "The Chocolate class must have a personal characteristic:\n" +
                "- Weight.\n" +
                "The Wine class must also have a personal characteristic:\n" +
                "- bottle volume.\n" +
                "Products in the wine group should have an additional tax, as they are part of the alcoholic beverages group and " +
                "amount to 10% of the price already increased by VAT. And this is constant and will not change. Because of this " +
                "additional tax, the Wine class has to have its own method for calculating the price, which will also include the " +
                "additional tax. This means that the calculation method must be redefined in the Wine class.\n" +
                "In all classes, the method for presenting object information must be created. The method has to be adapted to " +
                "the characteristics of the class, i.e. it has to present all the characteristics held by the given class. " +
                "Therefore, each class must have its own method for presenting information, i.e. the method must be redefined. " +
                "The main variant of the method will exist in the class Product, while in the classes Wine and Chocolate this " +
                "method will be redefined with the logic that takes into account the characteristic properties for these classes. " +
                "Such examples of method redefinition have already been illustrated in the OOP Postulates lesson, e.g. the Car and Convertible classes.\n" +
                "Finally, an object of the Product, Wine and Chocolate classes must be created in the main class, and the output " +
                "must display information about the products as well as the final price defined by the method for calculating the price. " +
                "For the base price, we take an arbitrary amount.\n" +
                "Incidentally, the 20% tax price is calculated by multiplying the base price by (100 + 20) / 100 = 1.2. " +
                "The 20% + 10% tax price is calculated by multiplying the base price as follows: (120 / 100) * (110 / 100) = 1.2 * 1.1, " +
                "which equals 1.32. So 20% + 10% equals 32%.\n" );
    }
}
