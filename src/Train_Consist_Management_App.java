import java.util.LinkedList;

public class Train_Consist_Management_App {

    public static void main(String[] args) {

        // Creating LinkedList to maintain ordered train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Adding bogies in correct formation
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist: " + trainConsist);

        // Insert Pantry Car at index 2
        trainConsist.add(2, "Pantry Car");
        System.out.println("After inserting Pantry Car at position 2: " + trainConsist);

        // Remove first and last bogie
        trainConsist.removeFirst(); // Removes Engine
        trainConsist.removeLast();  // Removes Guard

        System.out.println("Final Train Consist after removing first & last bogies: " + trainConsist);
    }
}

