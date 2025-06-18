//11. You are designing a music application where different musical instruments, such as Piano, Guitar, and Violin, have unique ways of producing sound. Implement a Java program using polymorphism where each instrument has a playSound() method that behaves differently for each type of instrument.
abstract class Instrument {
    abstract void playSound();
}

class Piano extends Instrument {
    void playSound() {
        System.out.println("Piano plays melody...");
    }
}

class Guitar extends Instrument {
    void playSound() {
        System.out.println("Guitar strums chords...");
    }
}

class Violin extends Instrument {
    void playSound() {
        System.out.println("Violin plays harmony...");
    }
}

public class Q11 {
    public static void main(String[] args) {
        Instrument[] instruments = {
            new Piano(),
            new Guitar(),
            new Violin()
        };

        for (Instrument i : instruments) {
            i.playSound();
        }
    }
}

