package main;

public class Constructors {
    public static class Person {
        private String name;
        private int age;
        private String origin;

//        DEFAULT CONSTRUCTOR
        public Person() {
            name = "";
        }

//        PARAMETERISED CONSTRUCTOR
        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }

//        OVERLOADED CONSTRUCTOR
        public Person(String name, int age, String origin){
            this.name = name;
            this.age = age;
            this.origin = origin;
        }

        public void introduce(){
            System.out.println("I'm " + name + ", I'm " + age + " years old and I am " + origin);
        }
    }

    public static void main(String[] args) {
        Person ida = new Person();
        Person john = new Person("John",99);
        Person herbert = new Person("Herbert",76,"German");

        ida.introduce();
        john.introduce();
        herbert.introduce();

    }
}