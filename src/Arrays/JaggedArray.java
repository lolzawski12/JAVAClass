package Arrays;
import java.util.Arrays;

public class JaggedArray {
    public static void main(String[] args) {
       mno();
       pot();

       int [] b = {7,1,3};
        System.out.println(unlucky1(b));

        int [] num1 = {1,4,6,2,8};
        System.out.println(Arrays.toString(midThree(num1)));

        addMatrix();


    } //--------------------------------------------------------------------------- end of main

    public static void mno (){
        int [][] arra = new int [3][];
        arra[0] = new int [3];
        arra[1]=new int [4];
        arra[2] = new int[2];
        //initializing a jagged array
        int count = 0;
        for (int i=0; i< arra.length; i++){
            for (int j=0; j< arra[i].length; j++){
                arra[i][j] = count ++;
            }
        }
        //printing the data
        for (int i=0; i<arra.length; i++){
            for (int j=0; j<arra[i].length; j++){
                System.out.println(arra[i][j]+ " ");
            }
            System.out.println();
        }
    }
  //  --------------------------------------------------------------------------------------------
public static void pot(){
        int [][] jaga = new int [3][];

        jaga[0] = new int [] {1,2,3};
        jaga[1] = new int [] {4,5,6,7,8};
        jaga[2] = new int [] {1,2,3,4,5,6};

        //printing the elements of the array in the simplist way..
    System.out.println(jaga[0][1]);
    System.out.println(jaga[1][0]);
    System.out.println(jaga[2][3]);

    for (int i=0; i<jaga.length; i++){
        for (int j=0; j<jaga[i].length; j++){
            if (j<jaga[i].length){
            System.out.print(jaga[i][j]+ " "); //this is not print ln because each number would be a new line
        } else{
                System.out.println("No Array Found ");
            }
        }
        System.out.println();  //this is to print a new line each time, this makes the columns
}
} //--------------------------------------------------------------------------------------------
//Return true is there is a 1, 3 in the array
    public static boolean unlucky1 (int[] nums){
        if (nums.length < 2){
            System.out.println("array is too short");
            return false;
        }
        for (int i=0; i<=1; i++){
            if(nums[i]==1 && nums[i+1]==3){
                return true;
            }
            }
        int lastIndex = nums.length -1;
        for (int i = lastIndex -1; i<=lastIndex; i++){
            if (nums[i] == 1 && nums[i+1]==3){
                return true;
            }
        }
        return false;
        }   //------------------------------------------------------------------------------------------
//Print the middle 3 values
    public static int[] midThree(int [] number){
        int middleIndex = number.length/2;
        int[] result = new int[3];

        result[0]=number[middleIndex-1];
        result[1]=number[middleIndex];
        result[2]=number[middleIndex+1];

        return result;

    }   //-----------------------------------------------------------------------------------------------------

    //addition of t matrix in an array
    public static void addMatrix(){
    int [][] abc = {{1,2,3},{1,2,3}};
    int [][] def = {{1,2,3}, {1,2,3}};

    //creating another matrix to store the results
    int hij[][] = new int [2][3];

    //adding and printing addition of both array
        for (int i=0; i<2; i++){
            for (int j = 0; j<3; j++){
                hij[i][j]= abc[i][j]+def[i][j];
                System.out.print(hij[i][j]+ " ");
            }
        }
        System.out.println();

    }  //-----------------------------------------------------------------------------------

    //cross matrix
//    public static void crossMatrix (){
//        int [][] abc = {{2,2,2}, {3,3,3}};
//        int [][] def = {{2,2,2}, {4,4,4}};
//
//        int hij [][] = new int [2][3];
//
//        for(int i = 0; i);

     }


     //---------------------------------------------------------------------------- end of package class




