package src;

import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class Train_Consist_Management_App {

    public static void main(String[] args) {

        System.out.println("=== UC10: Count Total Seats in Train (reduce) ===");

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 48));
        bogies.add(new Bogie("Sleeper", 72));

        // Step 2: Stream → map() → reduce()
        int totalCapacity = bogies.stream()
                .map(b -> b.getCapacity())
                .reduce(0, Integer::sum);

        // Step 3: Display total
        System.out.println("Total Seating Capacity: " + totalCapacity);

        System.out.println("==============================================");
    }
}