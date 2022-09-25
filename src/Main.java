import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");
        List<String> surname = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies",
                "Adamson", "Brown");
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            people.add(new Person(
                    names.get(new Random().nextInt(names.size())),
                    surname.get(new Random().nextInt(surname.size())),
                    new Random().nextInt(100),
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    Education.values()[new Random().nextInt(Education.values().length)]));
        }
        long countMinorPeople = people.stream()
                .filter(x -> x.getAge() < 18)
                .count();
        System.out.println(countMinorPeople);
        List<String> recruitsList = people.stream()
                .filter(x -> x.getAge() == 18)
                .map(Person::getSurname)
                .collect(Collectors.toList());
        System.out.println(recruitsList.toString());

        List<Person> workedPeopleList = people.stream()
                .filter(x -> 18<x.getAge() && x.getAge() < 65)
                .filter(x -> Education.HIGHER.equals(x.getEducation()))
                .sorted(Comparator.comparing(Person::getSurname))
                .collect(Collectors.toList());
        System.out.println(workedPeopleList.toString());
    }
}
