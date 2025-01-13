package Java8Concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamConceptDemo {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        people.add(new Person("David", 20));

        // Print all people
        System.out.println("All people:");
        people.forEach(System.out::println);

        // Filter people older than 25 and collect to a new list
        List<Person> filteredList = people.stream()
                .filter(person -> person.getAge() > 25)
                .collect(Collectors.toList());

        System.out.println("\nPeople older than 25:");
        filteredList.forEach(System.out::println);

        // Get names of all people in uppercase
        List<String> namesInUppercase = people.stream()
                .map(person -> person.getName().toUpperCase())
                .collect(Collectors.toList());

        System.out.println("\nNames in uppercase:");
        namesInUppercase.forEach(System.out::println);

        // Calculate average age
        double averageAge = people.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);

        System.out.println("\nAverage age: " + averageAge);

        // Get the person with the maximum age
        Person oldestPerson = people.stream()
                .max((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .orElse(null);

        System.out.println("\nOldest person: " + (oldestPerson != null ? oldestPerson : "No people in the list"));
    }


	

}
