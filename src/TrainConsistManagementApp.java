import java.util.ArrayList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Create an ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Add passenger bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after insertion
        System.out.println("Passenger Bogies after adding:");
        System.out.println(passengerBogies);

        // Remove one bogie
        passengerBogies.remove("AC Chair");

        // Display bogies after removal
        System.out.println("\nPassenger Bogies after removing AC Chair:");
        System.out.println(passengerBogies);

        // Check if Sleeper exists
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train consist.");
        } else {
            System.out.println("\nSleeper bogie does not exist in the train consist.");
        }

        // Print final list state
        System.out.println("\nFinal Passenger Bogies List:");
        System.out.println(passengerBogies);
    }
}