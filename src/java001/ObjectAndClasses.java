package java001;

public class ObjectAndClasses {

    public static void main(String[] args){
        Car.car();
        //class is first, method is second. From this class, get me this method.
        Car.person();
        Circle.CArea();
    }




}
class Car {   //Car is a class
    String brand;
    String model;
    String year;
    String name;
    String occupation;
    int age;


    public static void car() {   //car is a method
        Car myCar = new Car();  //constructor for an object from class Car... name of object is myCar
        Car tcar = new Car();   //constructor for an object from class Car (one constructor can only have ONE OBJECT)

        myCar.brand = "Subaru";      //these are objects
        myCar.model = "Outback";
        myCar.year = "2016";
        //if we write a new myCar, the last one will replace all the ones prior
        myCar.brand = "Toyota";
        myCar.model = "Camry";
        myCar.year = "2011";

        tcar.brand = "BMW";
        tcar.model = "X3";
        tcar.year = "2006";

        System.out.println(myCar.brand);
        System.out.println(myCar.model);
        System.out.println(myCar.year);

        System.out.println(tcar.brand + " " + tcar.model + " " + tcar.year);


    }

    public static void person() {
        Car person = new Car();
        person.name = "Lindsay";
        person.occupation = "unemployed";
        person.age = 23;

        System.out.println(person.name + " " + person.occupation + " " + person.age);
    }
}


    class Circle{
        double radius;
        double area() {
            return Math.PI * radius * radius;
        }
        static void CArea() { //method
            Circle circle1 = new Circle(); //constructor
            circle1.radius = 5.0;  //object
            double circle1Area = circle1.area();  //logic
            System.out.println(circle1Area);  //print
        }
    }

