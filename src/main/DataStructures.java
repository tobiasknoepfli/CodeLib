package main;

import java.util.*;

public class DataStructures {
    public static void main(String[] args) {
//        HASHMAP
        /* unique key-value pair that provides fast lookup and retrieval based on keys.
        HashMap is useful when you need to store and retrieve data based on unique keys,
        and when fast access to elements is required. */
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        /* adding elements */
        map.put("John", 25);
        map.put("Alice", 13);
        map2.put("Emily", 34);
        map2.put("John", 25);
        map2.put(null,null);
        System.out.println(map);
        System.out.println(map2);

        /* merge maps */
        map.putAll(map2);
        System.out.println(map);

        /* retrieving elements */
        System.out.println(map.get("John"));

        /* removing elements */
        map.remove("Alice");
        map.remove(null);
        System.out.println(map);

        /* checking existence */
        System.out.println(map.containsKey("John") + ", " + map.containsValue(23));

        /* Size */
        System.out.println(map.size());

//        HASHTABLE
        /* unique key-value pair that provides fast lookup and retrieval based on keys.
        HashMap is useful when you need to store and retrieve data based on unique keys,
        and when fast access to elements is required. HashTable is thread-safe, but
        has lower performance. It also doesn't allow null keys or values. */
        Hashtable<String,Integer> metals = new Hashtable<>();

        /* adding elements */
        metals.put("Gold",18);
        metals.put("Platinum",24);
        metals.put("Copper",14);
        metals.put("Copper",14);
        try {
            metals.put(null, 23);
        } catch(NullPointerException n){
            System.out.println("null not allowed");
        }
        System.out.println(metals);

        /* retrieving elements */
        System.out.println(metals.get("Platinum"));

        /* removing elements */
        metals.remove("Copper");
        System.out.println(metals);

        /* checking existence */
        System.out.println(metals.containsKey("Copper") + ", " + metals.containsValue(18));

        /* Size */
        System.out.println(metals.size());

//        HASHSET
        /* unordered collection of unique elements, does not allow duplicates.
        HashSet is useful when you want to store a collection of unique elements
        and don't require a specific order. */
        HashSet<String> set = new HashSet<>();

        /* adding elements */
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");
        System.out.println(set);

        /* iterate */
        Iterator<String> hSIterator = set.iterator();
        while (hSIterator.hasNext()) {
            System.out.print(hSIterator.next() + ", ");
        }
        System.out.println();

        /* removing elements */
        set.remove("Banana");
        System.out.println(set);

        /* checking existence */
        System.out.println(set.contains("Apple"));

        /* Size */
        System.out.println(set.size());

//        ARRAYLIST
        /* dynamic array implementation that provides fast random access and
        dynamic resizing. ArrayList is useful when you need a resizable
        array-like structure that provides fast access to elements.*/
        ArrayList<String> list = new ArrayList<>();

        /* adding elements */
        list.add("red");
        list.add("blue");
        list.add("yellow");
        list.add("red");
        System.out.println(list);

        /* retrieving elements */
        System.out.println(list.get(2));

        /* removing elements */
        list.remove(2);
        System.out.println(list.get(2));
        System.out.println(list);

        /* Size */
        System.out.println(list.size());

//        ARRAYDEQUE
        /* ArrayDeque is a double-ended queue that allows efficient
        insertion and removal at both ends. ArrayDeque is useful when
        you need to implement a queue or stack data structure with
        efficient insertion and removal operations at both ends.*/
        ArrayDeque<String> deque = new ArrayDeque<>();

        /* adding elements */
        deque.addFirst("one");
        deque.addLast("Two");
        deque.addLast("three");
        deque.addFirst("three");
        System.out.println(deque);

        /* retrieving elements */
        System.out.println(deque.getFirst() + ", " + deque.getLast());

        /* removing elements */
        deque.removeFirst();
        System.out.println(deque);

        /* Size */
        System.out.println(deque.size());

//        LINKEDLIST
        /* doubly linked list implementation that provides efficient insertion
        and removal operations at both ends, as well as fast access to elements
        using iterators. LinkedList is useful when you need to frequently insert
        and remove elements at the beginning or end of the list, or when you
        need to iterate over the elements.*/
        LinkedList<String> linkedList = new LinkedList<>();

        /* adding elements */
        linkedList.add("Hispanic");
        linkedList.add("White");
        linkedList.add("Black");
        linkedList.add("White");
        linkedList.addFirst("Brown");
        System.out.println(linkedList);

        /* checking occurrence */
        System.out.println(linkedList.indexOf("Black"));
        System.out.println(linkedList.lastIndexOf("White"));
        System.out.println(linkedList.contains("Indian"));

        /* retrieving elements */
        System.out.println(linkedList.getFirst() + ", " + linkedList.getLast());
        System.out.println(linkedList.get(3));

        /* iterating over the elements */
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
        System.out.println();

        /* removing elements */
        linkedList.removeLast();
        System.out.println(linkedList);

        /* Size */
        System.out.println(linkedList.size());

//        STACK
        /* Stack is a specialized data structure that follows the
        Last-In-First-Out (LIFO) principle. It provides push and pop
        operations. Stack is useful when you need to implement a LIFO
        behavior, such as in algorithms that require backtracking or
        undo functionality.*/
        Stack<String> stack = new Stack<>();

        /* pushing elements */
        stack.push("Cube");
        stack.push("Sphere");
        stack.push("Pyramid");
        stack.push("Cube");
        System.out.println(stack);

        /* popping elements */
        System.out.println(stack.pop());
        System.out.println(stack);

        /* checking existence */
        System.out.println(stack.isEmpty());

        /* Size */
        System.out.println(stack.size());

//        TREESET
        /* TreeSet is an ordered set implementation based on a self-balancing
        binary search tree (Red-Black Tree). It maintains elements in sorted
        order. TreeSet is useful when you need to maintain elements in a sorted
        order and efficiently perform operations like retrieving the first or
        last element. */
        TreeSet<String> treeSet = new TreeSet<>();

        /* adding elements */
        treeSet.add("Fir");
        treeSet.add("Birch");
        treeSet.add("Poplar");
        treeSet.add("Fir");
        System.out.println(treeSet);

        /* retrieving elements */
        System.out.println(treeSet.first() + ", " + treeSet.last());

        /* Removing elements */
        treeSet.remove("Fir");
        System.out.println(treeSet);

        /* Size */
        System.out.println(treeSet.size());


    }
}
