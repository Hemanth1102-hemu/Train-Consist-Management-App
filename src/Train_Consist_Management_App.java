import java.util.ArrayList;
import java.util.List;
public class Train_Consist_Management_App {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC2: Adding Passenger Bogies to Train\n");
        List<String> passengerBogies = new ArrayList<>();
      
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger Bogies After Adding:");
        System.out.println(passengerBogies);

        passengerBogies.remove("AC Chair");
        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println(passengerBogies);

        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("\nDoes 'Sleeper' bogie exist? " + exists);

        System.out.println("\nFinal Passenger Bogies:");
        System.out.println(passengerBogies);
    }
}
}
