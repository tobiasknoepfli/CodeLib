public class Attributes {
    public static class Person {

        //        ATTRIBUTE WITH PACKAGE ACCESS MODIFIER
        /* allows access from within the package */
        String name;

        //        ATTRIBUTE WITH PRIVATE ACCESS MODIFIER
        /* restricts access to only within the class */
        private int age;

        //        ATTRIBUTE WITH PROTECTED ACCESS MODIFIER
        /* allows access within the class and its subclasses */
        protected int weight;

        //        ATTRIBUTE WITH PUBLIC ACCESS MODIFIER AND STATIC FIELD
        /* allows access from any classes, is the same for all objects due to
        the static field */
        public static String race = "human";

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        //        GETTER FOR PRIVATE ATTRIBUTE
        /* needs getter (and setter) to access from outside the class */
        public int getAge() {
            return age;
        }

        public int getWeight() {
            return weight;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void introduce() {
            System.out.println("My name is " + name + ", and I am " + age + " years old.");
        }
    }

    public static void main(String[] args) {
        Person john = new Person("John", 25);
        Person ida = new Person("Ida", 43);

        john.introduce();
        ida.introduce();

        System.out.println(john.getName() + "is a " + john.race);
        System.out.println(ida.getName() + "is a " + ida.race);

        john.setWeight(97);
        System.out.println(john.getName() + " weighs " + john.getWeight() + " kg");

        System.out.println(ida.getName() + " is " + ida.getAge() + " years old");

    }
}


