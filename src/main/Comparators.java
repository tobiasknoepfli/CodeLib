package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparators {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 20, 50000.50));
        people.add(new Person("John", 24, 95000.00));
        people.add(new Person("Marc", 17, 2000.50));
        people.add(new Person("Cathy", 59, 105000.95));
        people.add(new Person("Henry", 44, 25000.23));
        people.add(new Person("Lucas", 36, 222000.22));
        people.add(new Person("Yusuf", 9, 250.00));

        reverseOrder(people);
        sortAge(people);
        sortMultipleCriteria(people);
    }

//    SORTING IN REVERSE ORDER
    public static void reverseOrder(List<Person> people) {
        Collections.sort(people, Comparator.comparing(Person::getName).reversed());
        for (Person p : people) {
            System.out.println(p.getName());
        }
    }

//    SORTING BY AGE
    public static void sortAge(List<Person> people) {
        Collections.sort(people, Comparator.comparingInt(Person::getAge));
        for (Person p : people) {
            System.out.println(p.getName() + " - " + p.getAge());
        }
    }

//    SORTING FIRST BY AGE, THEN BY SALARY
    public static void sortMultipleCriteria(List<Person> people) {
        Comparator<Person> comparator = Comparator.comparingInt(Person::getAge)
                .thenComparingDouble(Person::getSalary);
        Collections.sort(people,comparator);
        for(Person p:people){
            System.out.println(p.getName() + " - " + p.getAge() + " - " + p.getSalary());
        }
    }

    static class Person {
        private String name;
        private int age;
        private double salary;

        public Person(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getSalary() {
            return salary;
        }
    }

}
