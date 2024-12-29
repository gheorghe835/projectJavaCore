import text.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String text = "John.Davidson/Belgrade Michael.Barton/Krakow " +
                "Ivan.Perkinson/Moscow Mihail.Buzdugan/Bucuresti";

        // Împărțirea șirului pe bază de spațiu
        String [] textSir = text.split(" ");

        // Folosim ArrayList pentru a stoca obiectele Person
        ArrayList<Person> listPersoana = new ArrayList<>();

        // Procesarea fiecărei persoane
        for (String str : textSir) {
            // Împărțirea datelor persoanei folosind delimitatorul '.'
            String[] textSir1 = str.split("[./]");

            if (textSir1.length == 3) {  // Asigurarea că exist 3 părți
                Person p = new Person(textSir1[0], textSir1[1], textSir1[2]);
                listPersoana.add(p);
            } else {
                System.out.println("Date incorecte pentru: " + str);
            }
        }

        // Afișarea tuturor persoanelor
        for (Person person:
             listPersoana) {
            System.out.println(person);
        }

    }
}