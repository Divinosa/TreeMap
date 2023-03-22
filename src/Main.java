import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Oleg","Popov", 25));
        people.add(new Person("Ivan","Kolit", 17));
        people.add(new Person("Aleksandr","Nevskiy", 35));
        people.add(new Person("Yuriy","Dolgorukiy", 15));
        people.removeIf(person -> person.getAge() < 18);
        System.out.println(people);
    }
}