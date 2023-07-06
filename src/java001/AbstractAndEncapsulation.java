package java001;

public class AbstractAndEncapsulation {
    public static void main(String[] args) {

//                Shapes circle = new Circles();
//                circle.draw();
//
//                Shapes rectangle = new Rectangles();
//                rectangle.draw();

        vehicle caru = new Cars("petrol",70.80);
        caru.start();
        caru.stop();

        Cars car = new Cars("petrol",20.90);
        car.start();
        car.stop();

        Bus bus = new Bus("Diesel",100.20);
        bus.start();
        bus.stop();

        Employee employee = new Employee();
        employee.setName("Lindsay");
        employee.setId(007);
        employee.setSalary(100000.00);

        String name = employee.getName();
        int id = employee.getId();
        double salary = employee.getSalary();

        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);

        Car3 car3 = new Car3();
        car3.setBrand("Subaru");
        car3.setYear(2016);
        car3.setModel("Outback");

        String brand = car3.getBrand();
        int year = car3.getYear();
        String model = car3.getModel();

        System.out.println("Car Brand: " + brand);
        System.out.println("Car Year: " + year);
        System.out.println("Car Model: " + model);
        
    }
}

//Abstraction: similar to inheritance, but we know the functionality of it,
//but we don't know how that functionality works. Just showing the
//functionality, and hiding the inner working. Telephone: we know what it does,
//but not how it works.
abstract class Shapes{
    public abstract void draw();
}
class Circles extends Shapes{
    public void draw(){
        System.out.println("Drawing a circle");
    }
}
class Rectangles extends Shapes{
    public void draw(){
        System.out.println("Drawing a rectangle");
    }
}

abstract class vehicle{
    private int numWheels;
    private String engineType;
    private double fuelCapacity;

    public vehicle(int numWheels, String engineType, double fuelCapacity){
        this.numWheels = numWheels;
        this.engineType= engineType;
        this.fuelCapacity= fuelCapacity;
    }
    public abstract void start();
    public abstract void stop();
}

class Cars extends vehicle{
    public Cars(String engineType,double fuelCapacity){
        super (4,engineType,fuelCapacity);
    }
    public void start(){
        System.out.println("car is starting");
    }

    public void stop(){
        System.out.println("car is stopping");
    }
}
class Bus extends vehicle{
    public Bus(String engineType,double fuelCapacity){
        super(6,engineType,fuelCapacity);
    }

    public void start(){
        System.out.println("bus is Starting");
    }
    public void stop(){
        System.out.println("bus is stopping");
    }
}

// Encapsulation: hiding the data

class Employee{
    private String name;
    private int id;
    private double salary;
    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }
    public double getSalary(){
        return salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
}

//Encapsulation example
class Car3{
    private String brand;
    private int year;
    private String model;

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }
    public String getModel(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setYear (int year){
        this.year = year;
    }
    public void setModel (String model){
        this.model = model;
    }
}

//What is composition?
//Design principal. Where a class contains one or more objects of another class.
class Engine{
    private String type;

    public Engine(String type){
        this.type = type;
    }
    public void start(){
        System.out.println("I am starting");
    }
    public void stop(){
        System.out.println("I am stopping");
    }
}
class Car7{
    private String make;
    private String model;
    private Engine engine; //calling a class as a variable
public Car7(String make, String model, Engine engine){
    this.make = make;
    this.model = model;
    this.engine = engine;
}
public void startCar(){
    System.out.println("The car is starting");
    engine.start();
}
public void stopCar(){
    System.out.println("Car is stopping");
    engine.stop();
}
}