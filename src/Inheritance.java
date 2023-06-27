public class Inheritance {

    //    PARENT CLASS / SUPERCLASS
    static class Animal {
        protected String name;

        public Animal(String name) {
            this.name = name;
        }

        public void speak() {
            System.out.println("Animal speaks");
        }
    }

    //    SUBCLASS / CHILD
    static class Cat extends Animal {
        private String breed;

        /* Inherited constructor from parent, but overwritten */
        public Cat(String name, String breed) {
            super(name);
            this.breed = breed;
        }

        /* overridden method from parent */
        @Override
        public void speak() {
            System.out.println("Cat meows");
        }

        /* added method */
        public void purr() {
            System.out.println("Cat purrs");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Bello");
        animal.speak();

        Cat cat = new Cat("Whiskers", "Persian");
        cat.speak();
        cat.purr();
    }
}
