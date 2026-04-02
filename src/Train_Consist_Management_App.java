import java.util.HashSet;
import java.util.Set;

public class Train_Consist_Management_App{

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC3: Tracking Unique Bogie IDs Using HashSet\n");

        // Step 1: Create a HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Step 2: Add bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Step 3: Display the final unique set
        System.out.println("Bogie IDs added (duplicates included): BG101, BG102, BG103, BG101, BG102");
        System.out.println("\nUnique Bogie IDs in Train Consist:");
        System.out.println(bogieIds);
    }
}

