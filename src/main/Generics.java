package main;

import java.util.ArrayList;

public class Generics {
    //    GENERIC CLASS
    /* can create a Pocket object with an ArrayList of any type of contents */
    static class Pocket<T> {
        private ArrayList<T> contents;

        public void setContents(ArrayList<T> contents) {
            this.contents = contents;
        }

        public ArrayList<T> getContents() {
            return contents;
        }

        //        GENERIC METHOD WITH BOUNDED TYPE PARAMETER
        /* can use any type of ArrayList, in this case it is bounded to any
        single-type child class of Number, e.g. Integer or Double */
        public <T extends Number> void calculateBills(ArrayList<T> pocket) {
            double sum = 0;
            for (T money : pocket) {
                sum += money.doubleValue();
            }
            System.out.println(sum);
        }

        //        GENERIC METHOD WITH BOUNDED WILDCARD
        /* can use any type of ArrayList, can work with ArrayLists that
        contain elements from diverse classes, as long as they are
        children of Number, e.g. Integer, Double, Float */
        public void calculateMoney(ArrayList<? extends Number> pocket) {
            double sum = 0;
            for (Number money : pocket) {
                sum += money.doubleValue();
            }
            System.out.println(sum);
        }
    }


    public static void main(String[] args) {
//        GENERIC OBJECT
        /* can only be filled with strings */
        Pocket<String> cardPocket = new Pocket<>();
        ArrayList<String> cards = new ArrayList<>();
        cards.add("Visa");
        cards.add("ID");
        cardPocket.setContents(cards);

        Pocket<Integer> billPocket = new Pocket<>();
        ArrayList<Integer> bills = new ArrayList<>();
        bills.add(10);
        bills.add(100);
        bills.add(50);
        billPocket.setContents(bills);
        billPocket.calculateBills(bills);

//        GENERIC WILDCARD OBJECT
        /* can be filled with elements from any class */
        Pocket<?> coinPocket = new Pocket<>();
        /* can be filled with elements from any child class of Number */
        ArrayList<Number> coins = new ArrayList<>();
        coins.add(0.5);
        coins.add(2);
        coins.add(0.1);
        coins.add(0.2);
        coins.add(0.2);
        coins.add(5);
        coinPocket.calculateMoney(coins);
    }

}

