package text;
import java.util.ArrayList;
public class Person {
    public String prenume;
    public String nume;
    public String locNastere;

    public Person(String prenume,String nume,String locNastere){
        this.prenume = prenume;
        this.nume = nume;
        this.locNastere = locNastere;
    }

    @Override
    public String toString(){
        return prenume +" " + nume + " " + locNastere;
    }

}
