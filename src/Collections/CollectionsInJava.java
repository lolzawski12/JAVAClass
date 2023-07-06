package Collections;

//JAVA collection means a single unit of objects.
//JAVA collections frameworks provides many interfaces.
//Such as set, lists, queue, dequeue and classes like ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHash,
//TreeSet.
//JAVA collections framework represents a unified architecture for storing and manipulating a group of objects.

//Iterable
//Collection

    //LIST                          //QUEUE                         //SET
    //ArrayList                     //Priority Queue                //HashSet
    // LinkedList                   //Deque                         //LinkedHashSet
    //Vector                        //ArrayDeque                    //SortedSet
        //Stack                                                         //TreeSet

//Iterator interface provides a facility for iterating the elements in a forward directions only.

import java.util.*;

public class CollectionsInJava {
    public static void main(String[] args){
        ArrList();
        LinkList();
        Vector();
        stack();
        hashSet();
        treeSet();
}

public static void ArrList(){
    //ArrayList of integers
    ArrayList <Integer> numbers = new ArrayList<>();
    //adding elements to the ArrayList
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    numbers.add(50);

    //accessing elements in the ArrayList
    System.out.println("Element at index 2: " + numbers.get(2));

    //Update an element in ArrayList
    numbers.set(3,45);
    System.out.println("updated element at index 3: " + numbers.get(3));

    //Removing elements from ArrayList
    numbers.remove(1);
    System.out.println("Array size modified: " + numbers);

    //Checking if element is present in the Array
    System.out.println("Is there number 50? " + numbers.contains(50));

    //For each loop iterating over ArrayList
    System.out.println("Elements in the ArrayList: ");
    for (int number : numbers){
        System.out.println(number + " ");
    }
    System.out.println();
    //to get the size of an ArrayList
    System.out.println("The size of the given array is: " + numbers.size());
}

public static void LinkList(){
    LinkedList<String> names = new LinkedList<>();

    //Add names to this LinkedList
    names.add("Bob");
    names.add("Charlie");
    names.add("Joe");
    names.add("Eva");
    names.add("David");

    System.out.println("Elements in the LinkedList are: " + names);

    //At any given index
    System.out.println("Name at given index: " + names.get(4));

    //Update a name
    names.set(3, "Daniel");
    System.out.println("Revised name list: " + names);

    //Remove a name
    names.remove(2);
    System.out.println("Removed name at index 2:");

    //Check if the name exists
    System.out.println("Eva exist?" + names.contains("Eva"));

    //Iterating
    for (String name : names){
        System.out.print(name + " ");
    }
    System.out.println();

    //Final size
    System.out.println("Size of the LinkedList is: " + names.size());
}

public static void Vector(){
    Vector<String> vector = new Vector<>();

    //Add names to this LinkedList
    vector.add("Bob");
    vector.add("Charlie");
    vector.add("Joe");
    vector.add("Eva");
    vector.add("David");

    //print all elements
    System.out.println("Vector contains: " + vector);

    //Getting the capacity
    System.out.println("Capacity of vector is: " + vector.capacity());

    //Trim
    vector.trimToSize();
    System.out.println("Size of vector after trimming: " + vector.capacity());

    //Adding elements
    vector.add("Alice");
    vector.add("Katrina");
    System.out.println("Capacity after adding names: " + vector.capacity());
    System.out.println("New vector: " + vector);

    String firstElement = vector.firstElement();
    String lastElement = vector.lastElement();

    System.out.println(firstElement + " " + lastElement);

    //Check if vector is empty
    System.out.println("If the vector empty? " + vector.isEmpty());

    //Clearing vector
    vector.clear();
    System.out.println("Vector after clearing: " + vector);

}
    public static void stack(){
    Stack<String> stack = new Stack<>();

    //Add
    stack.push("Gayatri");
    stack.push("Driss");
    stack.push("Claudia");
    stack.push("Ekuye");
    stack.push("Lindsay");

    //Check if stack is empty
    System.out.println("Is this stack empty? " + stack.empty());

    //Peeking the top element in the stack
    String topElement = stack.peek();
    System.out.println(topElement);

    //Popping elements from the stack
    String poppedElement = stack.pop();
    System.out.println("Popped element: " + poppedElement);

    //Check the stack
    System.out.println("Is stack empty? " + stack.empty());

    //Searching for element
    int index = stack.search("Lindsay");
    System.out.println("Index of searched element: " + index);

    }

    //SETS
    //Create a HashSet of Strings - order is not guaranteed

    public static void hashSet(){
        HashSet<String> set = new HashSet<>();

        //Adding to HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Pineapple");
        set.add("Mango");

        //Adding a duplicate element
        set.add("Apple");
        //set will not show a duplicate in the console

        //Checking size
        System.out.println("The size of the HashSet is: " + set.size());

        //Check if element exists
        System.out.println("Is Banana there? " + set.contains("Banana"));

        //Remove from set
        set.remove("Mango");
        System.out.println("After removing Mango: " + set);

        //Iterating
        System.out.println("Elements in this set: ");
        for (String element : set){
            System.out.println(element + " ");
        }
        System.out.println();
    }

    //LinkedHashSet
    //LinkedHashSet is an implementation of the Set interface that maintains the insertion order of elements.
    //It combines the functionality of HashSet and LinkedList, providing both the constant-time performance for basic
    //operations and the order=preserving behavior.

    //TreeSet
    //TreeSet is an implementation of the SortedSet interface that maintains elements in a sorted order based on their
    //natural ordering or a custom comparator. It provides efficient operations for adding, removing, and retrieving
    //elements, and the elements are always sorted in ascending order.

    public static void treeSet(){
        TreeSet<Integer> tset = new TreeSet<>();

        tset.add(5);
        tset.add(4);
        tset.add(3);
        tset.add(2);
        tset.add(6);
        tset.add(1);

        //Duplicate
        tset.add(2);

        //Print size of the TreeSet
        System.out.println(tset.size());

    }



}
