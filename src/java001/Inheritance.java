package java001;

public class Inheritance {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();

        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Cat cat = new Cat();
        cat.meow();
        cat.eat();

        Breed breed = new Breed();
        breed.lab();
        breed.sleep();

        breed.poodle();
        breed.bark();
        breed.eat();

    }

} //main method is empty

class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
    void sleep(){
        System.out.println("This Animal is sleeping...");
    }
        }

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}
class Breed extends Dog{
    void lab() {
        System.out.println("Labrador Retriever");
    }
    void poodle() {
            System.out.println("Poodle");
        }

}


