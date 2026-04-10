package Test;

import static org.junit.Assert.*;
import org.junit.Test;
import src.Bogie;

import java.util.*;
import java.util.stream.Collectors;

public class BogieReduceTest {

    @Test
    public void testReduce_TotalSeatCalculation() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 48)
        );

        int total = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        assertEquals(72 + 56 + 48, total);
    }

    @Test
    public void testReduce_MultipleBogiesAggregation() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("Sleeper", 72)
        );

        int total = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        assertEquals(144, total);
    }

    @Test
    public void testReduce_SingleBogieCapacity() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("AC Chair", 56)
        );

        int total = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        assertEquals(56, total);
    }

    @Test
    public void testReduce_EmptyBogieList() {
        List<Bogie> bogies = new ArrayList<>();

        int total = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        assertEquals(0, total);
    }

    @Test
    public void testReduce_CorrectCapacityExtraction() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("First Class", 48)
        );

        List<Integer> extracted = bogies.stream()
                .map(Bogie::getCapacity)
                .toList();

        assertEquals(Arrays.asList(72, 48), extracted);
    }

    @Test
    public void testReduce_AllBogiesIncluded() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 48)
        );

        int total = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        assertEquals(176, total);
    }

    @Test
    public void testReduce_OriginalListUnchanged() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));

        List<Bogie> copy = new ArrayList<>(bogies);

        bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        assertEquals(copy.size(), bogies.size());
        assertEquals(copy.get(0).getName(), bogies.get(0).getName());
    }
}