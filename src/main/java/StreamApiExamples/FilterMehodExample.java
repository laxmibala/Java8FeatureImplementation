package StreamApiExamples;

import java.util.List;
import java.util.stream.Collectors;

public class FilterMehodExample {
    public static void main(String[] args) {

        List<Person> personList =Person.getPersonData();

            // to find person details whose first name is Mike
        final String searchName="Mike";
        List<Person> foundPerson =personList.stream().
                    filter(person -> person.firstName.equalsIgnoreCase(searchName))
                    .collect(Collectors.toList());
        System.out.println("*********person details whose first name is Mike*********");
        if(null != foundPerson) {
            foundPerson.forEach(System.out::println);
        } else {
            System.out.println("Could not found objects in list");
        }

        System.out.println("*********person details whose age is between 20-35*********");

        //to find person details whose age is between 20-35
        List<Person> foundPerson1 = personList.stream().
                filter(person -> person.age<35 && person.age>20).collect(Collectors.toList());

        if(null != foundPerson1) {
            foundPerson1.forEach(System.out::println);
        } else {
            System.out.println("Could not found objects in list");
        }

        System.out.println("*********sort person by first name*********");
        personList.sort((Person o1, Person o2)->o1.firstName.compareTo(o2.firstName));
        personList.forEach((person)->System.out.println(person));

        System.out.println("*********sort person by age*********");
        personList.stream().sorted((Person p1,Person p2)-> p2.age-p1.age);
        personList.forEach((person)->System.out.println(person));

        System.out.println("*********sort person by name and then age*********");
        personList.stream().sorted((Person p1, Person p2) ->{
            if(p1.firstName.compareTo(p2.firstName)==0)
                return p1.age-p2.age;
            else
                return p1.lastName.compareTo(p2.lastName) ;
        });

        personList.forEach((person)->System.out.println(person));
    }




}
