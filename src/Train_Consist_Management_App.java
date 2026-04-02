import java.util.LinkedHashSet;

public class Train_Consist_Management_App {

    public static void main(String[] args) {

        // LinkedHashSet maintains order + prevents duplicates
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Adding bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        System.out.println("Initial Train Formation: " + trainFormation);

        // Attempting duplicate entry
        trainFormation.add("Sleeper");

        System.out.println("After attempting to add duplicate Sleeper: " + trainFormation);

        // Final formation
        System.out.println("Final Ordered Formation (No duplicates): " + trainFormation);
    }
}
