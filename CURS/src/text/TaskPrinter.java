package text;

public class TaskPrinter {
    public static void main(String[] args) {
        System.out.println("Exercise\n" +
                "Give the following String with which to present the data of some persons:\n" +
                "String text = \"John.Davidson/Belgrade Michael.Barton/Krakow Ivan.Perkinson/Moscow\".\n" +
                "\n" +
                "This is an example, the string to be processed may contain the data of a different number of persons, and of course the data of the persons may be different.\n" +
                "Logic needs to be created that will pull data separately from this record:\n" +
                "- first name;\n" +
                "- first name;\n" +
                "- place of birth.\n" +
                "In other words, the displayed String must be edited using the String class method and each person's data must be output separately. The main method to be used is the method for sorting Strings into multiple parts.\n" +
                "The individual parts obtained (first name, last name, city) must be used to create Person objects. Therefore, the Person class must be created in the program, as well as appropriate fields within it (first name, last name, city). So in the Person class there must be three properties and the constructor for initializing their values.\n" +
                "All objects representing persons must be wrapped in a string (the string must be of type Person[]). To make sure that everything is done properly, at the end the object string must be passed and the person data must be written. On output the following display should be obtained for the string given as an example:\n" +
                "John Davidson Belgrade\n" +
                "Michael Barton Krakow\n" +
                "Ivan Perkinson Moscow\n" +
                "\n" +
                "In short, the program flow should be as follows:\n" +
                "- split the given String into several parts to get the first name, last name and cities;\n" +
                "- use the obtained data to create the object of type Person;\n" +
                "- put the obtained objects of type Person into a string Person[];\n" +
                "- at the end, pass through a string of persons and output their data.\n" );
    }
}
