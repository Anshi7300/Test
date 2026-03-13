public class Animal {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();      

        Dog d = new Dog();
        d.makeSound();     
    }
    public void makeSound() {
        System.out.println("some sound...");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark...");
    }
}
