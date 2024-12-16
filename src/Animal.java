public class Animal{
    protected String species;

    public Animal(String species){
        this.species = species;
    }

    protected void makeSound() {
        System.out.println("Some generic animal sound.");
    }
}