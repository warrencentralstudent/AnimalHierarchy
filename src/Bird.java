public class Bird extends Animal{

    public Bird() {
        super("Bird");
    }

    @Override
    protected void makeSound() {
        System.out.println("Chirp Chirp.");
    }
}