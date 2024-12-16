public class Mammal extends Animal {

    public Mammal() {
        super("Mammal");
    }

    @Override
    protected void makeSound() {
        System.out.println("Some Mammal Sound.");
    }
}


