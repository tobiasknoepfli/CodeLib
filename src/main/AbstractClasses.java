package main;

public class AbstractClasses {
    //    ABSTRACT PARENT CLASS
    abstract static class Animal {
        private String name;

        public Animal(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        /* Abstract method, not being initialised */
        public abstract void makeSound();
    }

    //    CHILD CLASS INHERITING FROM ABSTRACT CLASS
    static class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }

        /* Implementing the abstract method */
        @Override
        public void makeSound() {
            System.out.println("Woof!");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        System.out.println(dog.getName());
        dog.makeSound();
    }
}

