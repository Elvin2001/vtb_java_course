import edu.vtb.java.core.entity.Animal;
import edu.vtb.java.core.entity.Cat;
import edu.vtb.java.core.entity.Dog;
import edu.vtb.java.core.entity.Tiger;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(200, 0),
                new Tiger(700, 30),
                new Dog(500, 10)
        };

        startCompetition(10, animals);
    }

    public static void startCompetition(int distance, Animal... animals) {
        for (Animal animal : animals) {
            animal.run(distance);
            animal.swim(distance);
            System.out.println("-------------------------------");
        }
    }
}