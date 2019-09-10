package StreamApiExamples;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Person {

    public String firstName;
    public String lastName;
    public int age;
    public String contact;
    public Person(String firstName, String lastName,
                  int age, String contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.contact = contact;
    }
    public String toString() {
        return "[" + firstName + " " + lastName +
                " " + age + " " +contact +"]";
    }

    public static List<Person> getPersonData() {
        List<Person> personList = Stream.of(
                new Person("Mike", "harvey", 34, "001894536"),
                new Person("Nick", "young", 75, "005425676"),
                new Person("Jack", "slater", 21, "009654153"),
                new Person("Gary", "hudson", 55, "00564536"),
                new Person("Mike", "harvey", 21, "003685417"),
                new Person("Gary", "hudson", 25, "00452341"))
                .collect(Collectors.toList());
        return personList;
    }
}
