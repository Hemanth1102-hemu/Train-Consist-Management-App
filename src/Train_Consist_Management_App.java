import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Bogie {
    private String name;
    private int capacity;

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
        return name + " Bogie → Capacity: " + capacity;
    }
}

public class Train_Consist_Management_App {

    public static void main(String[] args) {

        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 40));

        System.out.println("Before Sorting (Original Order):");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }

        bogieList.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("\nAfter Sorting (By Capacity - Ascending):");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }
    }
}