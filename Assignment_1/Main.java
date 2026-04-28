public class Main {
    public static void main(String[] args) {
        // Creating an instance of Sedan
        Sedan mySedan = new Sedan("Toyota Camry");

        System.out.println("--- Demonstration of Overriding ---");
        // Overriding: The Sedan's specific version of accelerate() is called
        mySedan.accelerate();

        System.out.println("\n--- Demonstration of Overloading ---");
        // Overloading: Calling the version of accelerate that takes an integer parameter
        mySedan.accelerate(25); 

        System.out.println("\n--- Interface & Other Methods ---");
        mySedan.checkSafetySystems();
        mySedan.stop();
        mySedan.displayInfo();
    }
}