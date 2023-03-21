import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Oleg","Popov", 25));
        people.add(new Person("Ivan","Kolit", 30));
        people.add(new Person("Yuriy","Dolgorukiy", 40));
        people.add(new Person("Aleksandr","Nevskiy", 35));
        people.sort((o1, o2) -> {if (o1.getSurname().length() > o2.getSurname().length()){
            return 1;
        } else if (o1.getSurname().length() < o2.getSurname().length()) {
            return -1;
        } else {
            return o1.getAge() - o2.getAge();
        }});
        System.out.println(people);
    }
}