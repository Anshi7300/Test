public class overriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();
    }
    public void makeSound(){
        System.out.println("some Sound");
    }

}
