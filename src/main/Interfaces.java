package main;

public class Interfaces {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Tequila tequila = new Tequila();

//        STATIC METHOD THAT CAN ONLY BE CALLED BY ITS INTERFACE
        Ripe.isRipe(true);

//        METHODS THAT CAN BE CALLED BY THEIR OBJECTS
        apple.isDisgusting(true, false);
        tequila.isDisgusting(true, false);
    }

    //    CLASS IMPLEMENTING DISGUSTING AND RIPE INTERFACE
    public static class Apple implements Disgusting, Ripe {
        boolean worm, fungus;

        public Apple() {
        }

        /* Method has to be implemented because the Disgusting interface inherits
        the Worm interface */
        @Override
        public boolean hasWorm(boolean worm) {
            return worm ? true : false;
        }

        /* isDisgusting does not need to be implemented because it is a default method */
        /* isRipe does not need to be implemented because it is a static method */
        /* hasFungus does not need to be implemented because it is a static method */
    }

//     CLASS IMPLEMENTING DISGUSTING INTERFACE
    public static class Tequila implements Disgusting {
        boolean worm, fungus;

        public Tequila() {
        }

        /* Method has to be implemented because the Disgusting interface inherits
        the Worm interface */
        @Override
        public boolean hasWorm(boolean worm) {
            return worm ? true : false;
        }

        /* isDisgusting can be implemented because it is a default method and can be overridden */
        @Override
        public void isDisgusting(boolean worm, boolean fungus) {
            if (worm && fungus) {
                System.out.println("disgusting");
            } else if (fungus) {
                System.out.println("not great");
            } else {
                System.out.println("yummy");
            }
        }

        /* isRipe does not need to be implemented because it is a static method */
        /* hasFungus does not need to be implemented because it is a static method */
    }

    //    INTERFACE WITH METHOD
    /* has to be implemented in every class that inherits interface */
    public interface Worm {
        public boolean hasWorm(boolean worm);
    }

    //    INTERFACE WITH STATIC METHOD
    /* does not need to be explicitly implemented, is the same for all classes
    that inherit it, can only be called by the interface name */
    public interface Fungus {
        public static boolean hasFungus(boolean fungus) {
            return fungus ? true : false;
        }
    }

    //    INTERFACE INHERITING FROM WORD AND FUNGUS WITH DEFAULT METHOD
    /* does not need to be explicitly implemented, is the same for all classes
    that inherit it unless it is overridden */
    public interface Disgusting extends Worm, Fungus {
        default void isDisgusting(boolean worm, boolean fungus) {
            if (worm && fungus) {
                System.out.println("disgusting");
            } else if (worm || fungus) {
                System.out.println("not great");
            } else {
                System.out.println("yummy");
            }
        }
    }

    //    INTERFACE WITH STATIC METHOD
    /* does not need to be explicitly implemented, is the same for all classes
    that inherit it, can only be called by the interface name */
    public interface Ripe {
        public static void isRipe(boolean ripe) {
            System.out.println(ripe ? "is ripe" : "is not ripe");
        }
    }
}