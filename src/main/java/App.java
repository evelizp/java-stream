import model.Person;
import model.Product;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Person p1 = new Person(1, "Erick", LocalDate.of(1991, 1, 21));
        Person p2 = new Person(2, "Tomas", LocalDate.of(1990, 2, 21));
        Person p3 = new Person(3, "Fiorella", LocalDate.of(1980, 6, 23));
        Person p4 = new Person(4, "Duke", LocalDate.of(2019, 5, 15));
        Person p5 = new Person(5, "James", LocalDate.of(2010, 1, 4));

        Product pr1 = new Product(1, "Ceviche", 15.0);
        Product pr2 = new Product(2, "Chilaquiles", 25.50);
        Product pr3 = new Product(3, "Bandeja Paisa", 35.50);
        Product pr4 = new Product(4, "Ceviche", 15.0);

        List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5);
        List<Product> products = Arrays.asList(pr1, pr2, pr3, pr4);


        // Lambda //method reference
        // list.forEach(System.out::println);
        /*for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }*/

        /*for(Person p : persons){
                System.out.println(p);
        }*/

        //persons.forEach(p -> System.out.println(p));
        persons.forEach(System.out::println);



    }
    public static int getAge(LocalDate birthDate) {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public static void printList(List<?> list){
        list.forEach(System.out::println);
    }
}
