public class Dog {
    private String name;
    private String breed;

    public Dog(String n, String b) {
        name = n;
        breed = b;
    }

    public void setName(String n) {
        name = n;
    }

    public void setBreed(String b) {
        breed = b;
    }

    public void printDog() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Tommy", "Bulldog");
        Dog dog2 = new Dog("Max", "Beagle");

        dog1.setName("Rocky");
        dog2.setBreed("Labrador");

        dog1.printDog();
        dog2.printDog();
    }
}
