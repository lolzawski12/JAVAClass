package Arrays;

public class ArraysInJava {
//An array is a group of the same things (Christmas lights)
//An array is a collection of similar type of elements which has contiguous memory locations.
//Java array is an object which contains elements of a similar data type.
//Additionally, the elements of an array are stored in a  contiguous memory location. It is a data

    public static void main(String[] args) {


        int[] numbers = new int[5];  //this is declaration & instantiation (the new part makes a copy)
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;            //all of these integers are initialization
        numbers[3] = 40;
        numbers[4] = 50;
        // numbers[5] = 60;

        for (int i = 0; i < numbers.length; i++) { //this is a loop
            System.out.println(numbers[i]);
            //if no value is given, it will print 0
            System.out.println(numbers.getClass());
        }

        //int[] arr = {1, 2, 3, 4, 5, 6};
        //this is one way you declare an array
        //Arrays start from 0, each number is an index (key, value 1 is index 0, value 1, 5 is index 4, value 5)
        //Int is declaring what type of data is inside
        //[] means it is an array, arrays cannot be changed, they are immutable (this means you cannot change it
        //later in code, you can only change it in the main component.

        int array[] = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        evenArray();
            removeDuplicates();

            int a[] = {1,2,3,4,5};
            min(a);

            int arr3[] = arGet();
            for (int i = 0; i<arr3.length; i++){
                System.out.print(arr3[i]);
            }
        int [] b= { 1, 1, 2, 4, 1};
            array123 (b);



            }
public static void evenArray(){
    int [] arr1 = {1,2,3,4,5,6,10};
    //print even numbers
        for (int i=0; i< arr1.length; i++){
        if (arr1[i]%2 == 0) {
            System.out.println(arr1[i]);
        }}}




    public static void removeDuplicates(){
        String [] names = {"sam", "john", "victor", "donald", "eva", "mark", "john", "sam"};
        //remove repeating names from the array.
        int length = names.length;
                for (int i = 0; i< length; i++){
                    for (int j = i+1; j<length; j++){
                        if(names[i].equals(names[j])){
                            names[j] = names[length -1];
                            length --;
                            j--;
                        }
                    }
                }
        System.out.println("names after removing duplicates: ");
                for( int i=0; i<length; i++){
                    System.out.println(names[i]);
                }
    }

    static void min(int arr[]){
        int min = arr[0];
        for (int i = 1; i<arr.length; i++){
            if (min>arr[i])
                min=arr[i];
            System.out.println(min);
        }
    }

    static int[] arGet(){
        return new int [] {10,20,30,40,50,60,70,80,90};

    }

    //Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
    public static boolean array123(int [] num) {
        for (int i = 0; i < num.length-2; i++) {
            if(num[i] == 1 && num[i+1] ==2 && num[i+2] ==3){
                return true;
        }
    }

        return false;

    }





}










