package java001;

public class Polymorphism {

    public static void main(String[] args) {
        Animal2 animal = new Animal2();
        Animal2 animal1 = new Dog2();
        Animal2 animal2 = new Cat2();

        animal.makeSound();
        animal2.makeSound();
        animal1.makeSound();

        //name.method -- the whole thing is an object

        Shape shape = new Shape();
        System.out.println("Area of Shape " + shape.calculateArea());
        Rectangle rectangle = new Rectangle(6,4);
        System.out.println("Area of a Rectangle " + rectangle.calculateArea());

        Calculator calculator = new Calculator();
        float sum = calculator.add(5,9.8f);
        System.out.println("sum of given numbers: " + sum);

        int sum1 = calculator.add(6,9);
        System.out.println("sum of two integers: " + sum1);

        System.out.println(calculator.add(3d,9d));

        ConcatString thisstr = new ConcatString();
        System.out.println(thisstr.str("Hello", " world"));
        System.out.println(thisstr.str("My", " name is ", "Lindsay"));

    }
}
//METHOD OVERRIDING
class Animal2{ //constructor
    public void makeSound(){
        System.out.println("Animal makes Sound");
    }
}
//Dog2 and Cat2 are inheritors, just like in the inheritance tab

class Dog2 extends Animal2{  //Dog2 is an instance
    @Override
    public void makeSound(){ //method
        System.out.println("Dogs bark");
    }
}
class Cat2 extends Animal2{
    @Override
    public void makeSound(){ //methods have to have the same name to create overrides
        System.out.println("Cats meow");
    }
}

//example 2

class Shape{
    double calculateArea(){
        return 0;
    }
}
class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double calculateArea(){
        return length*width;

}
}

//METHOD OVERLOADING
class Calculator{
    public int add(int a, int b){
        System.out.println();
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public float add(int a, float b){
        return a+b;
    }
}

//example of method overloading I make up
//concat 2,3 strings


class ConcatString{
    public String str(String a, String b){
    return a+b;
    }
    public String str(String a, String b, String c){
        return a+ b +c;
    }
}