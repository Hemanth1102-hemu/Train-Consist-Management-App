import java.util.HashMap;
import java.util.Map;

            public class Train_Consist_Management_App {

                public static void main(String[] args) {

                    HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

                    bogieCapacityMap.put("Sleeper", 72);
                    bogieCapacityMap.put("AC Chair", 56);
                    bogieCapacityMap.put("First Class", 40);

                    System.out.println("Bogie Capacity Mapping:");

                    for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
                        System.out.println(entry.getKey() + " Bogie → Capacity: " + entry.getValue());
                    }

                    System.out.println("\nTotal Bogies Mapped: " + bogieCapacityMap.size());
                }
            }
