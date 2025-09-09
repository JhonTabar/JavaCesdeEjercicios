import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // A traves de arraylist
        List<Animal> tusAnimales = new ArrayList<>();
        tusAnimales.add(new Perro());
        tusAnimales.add(new Perro());
        tusAnimales.add(new Perro());
        tusAnimales.add(new Perro());

        for (Animal animal : tusAnimales) {
            animal.hacerSonido();
        }

        // a traves de array
        Animal[] misAnimales = new Animal[3];
        misAnimales[0] = new Perro();
        misAnimales[1] = new Gato();
        misAnimales[2] = new Animal();

        for (Animal animal : misAnimales) {

            animal.hacerSonido();
        }

        /*
         * for (int index = 0; index < misAnimales.length; index++){
         * misAnimales[index].hacerSonido();
         * }
         */
    }
}