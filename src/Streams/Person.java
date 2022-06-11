package Streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private int age;
    private GENDER gender;


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public Person(String name, int age, GENDER gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public GENDER getGender() {
        return gender;
    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("Jay", 20, GENDER.FEMALE),
                new Person("Ama ", 10, GENDER.FEMALE),
                new Person("Kofi", 40, GENDER.MALE),
                new Person("Polly", 30, GENDER.FEMALE),
                new Person("Yaw", 60, GENDER.MALE),
                new Person("Millie", 50, GENDER.FEMALE),
                new Person("Bob", 70, GENDER.FEMALE),
                new Person("William", 60, GENDER.MALE),
                new Person("Don", 100, GENDER.MALE),
                new Person("Henry", 90, GENDER.MALE)
        );

    }

    public static void main(String[] args) {

        List<Person> people = getPeople();

        //a.
        List<Person> peopleByAge = people.
                stream().
                sorted(Comparator
                        .comparing(Person::getAge))
                .collect(Collectors.
                        toList());

//        System.out.println(peopleByAge);

        //b.

        List<Person> female = people.stream().filter(p -> p.getGender() == GENDER.FEMALE).collect(Collectors.toList());
//        System.out.println(female);


        //c.
        List<Person> olderThan50 = people.stream().filter(p -> p.getAge() > 50).collect(Collectors.toList());
//        System.out.println(olderThan50);


        //d.
        List<Person> youngest = people.stream().min(Comparator.comparing(p -> p.getAge())).stream().collect(Collectors.toList());
//        System.out.println(youngest);


        //e.
        List<Person> oldest = people.stream().max(Comparator.comparing(p -> p.getAge())).stream().collect(Collectors.toList());
//        System.out.println(oldest);

        //f

        //d.
        List<Person> maleOver50 = people.stream().filter(p->p.getGender() == GENDER.MALE).filter(p->p.getAge()<50).collect(Collectors.toList());
        System.out.println(maleOver50);
    }
}
