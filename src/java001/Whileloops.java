package java001;
import java.sql.SQLOutput;
import java.util.*;



public class Whileloops {
    public static void main(String[] args){
        //w1();
       //w2();
       //w3();
        //w4();
        //w5();
        //f1();
        //Aflag();
        bFlag();

    }

    public static void w1(){
        int i = 1;
        while (i<=10){
            System.out.println(i);
            i++;
        }
    }

    public static void w2(){
        Scanner input = new Scanner(System.in);
        int number = 0;
        while (number <= 0){
            System.out.print("Enter A Non-negative number:");
            number = input.nextInt();
        }
        System.out.println("You have entered:" + number);
    }

    public static void w3(){
        Scanner input = new Scanner (System.in);
        int sum = 0;
        int number;

        System.out.println("Enter numbers (enter 0 to exit): ");
        do{
            number = input.nextInt();
            sum += number;
        }while (number !=0);
        System.out.println("The sum is: " + sum);
    }
    public static void w4(){
        Scanner i = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Menu: ");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");

            choice = i.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Option 1 Selected");
                    break;
                case 2:
                    System.out.println("Option 2 Selected");
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;

            }
        }while (choice !=3);
    }
    public static void w5(){
        Random random = new Random();
        int targetnumber = 6;
        int rollednumber;
        do{
            rollednumber = random.nextInt(6) + 1;
            System.out.println("Rolled: " + rollednumber);
        }while (rollednumber !=targetnumber);
        System.out.println("Target number rolled");
    }


    //For loops
    public static void f1(){
        for (int i = 1; i<=5; i ++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//    public static void Aflag(){
//        int width = 50;
//        int height = 10;
//
//        for(int i = 0; i<9; i++){
//            if (i%2 == 0){
//                printStars(width);
//            } else{
//                printHyphens(width);
//            }
//        }
//        for(int i = 0; i<height - 9; i++){
//            if (i%2==0){
//                printRedStripes(width);
//            } else{
//                printWhiteStripes(width);
//            }
//        }
//    }
//private static void printStars(int width){
//        for (int i = 0; i < width; i++){
//            System.out.print("* ");
//        }
//    System.out.println();
//}
//private static void printHyphens(int width){
//        for(int i = 0; i<width; i++){
//            System.out.print("- ");
//        }
//    System.out.println();
//}
//private static void printRedStripes(int width){
//        for(int i = 0; i<width; i++){
//            System.out.print("= ");
//        }
//    System.out.println();
//}
//private static void printWhiteStripes(int width){
//    for(int i = 0; i<width; i++){
//        System.out.print("~ ");
//    }
//    System.out.println();
//}
public static void bFlag(){
    // declare and initialize variables
    int height =  26;
    int width = 40;
    int temp = 3;

    // we use only one nested loop to print all the parts of the flag
    for(int m = 0; m<= height; m++) {
        for(int n = 0; n <= width; n++){
            // print American flag
            if(m < 5 && n > 14){
                if((m + n) % 2 == 0 && n < 26){
                    System.out.print("*");
                } else if(n > 26){
                    System.out.print("=");
                } else {
                    System.out.print(" ");
                }
            } else {
                if(m < 9 && n < 15) {
                    System.out.print(" ");
                }
                if(m > 4 && m < 9 && n > 13 && n <40) {
                    System.out.print("=");
                }
            }
        }
        if(m >= 20) {
            if(m % 2 != 0) {
                temp++;
            }
        }
        System.out.print("\n");
    }
}


}
