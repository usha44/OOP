
abstract class Bird {
    
    abstract void fly();
}


class Eagle extends Bird {
    @Override
    void fly() {
        System.out.println("Eagle is soaring high in the sky.");
    }
}


class Penguin extends Bird {
    @Override
    void fly() {
        System.out.println("Penguins cannot fly, but they swim really well.");
    }
}


public class BirdTest {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird penguin = new Penguin();

        eagle.fly();     
        penguin.fly();   
    }
}
