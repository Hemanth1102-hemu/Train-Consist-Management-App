import org.junit.Test;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class Bogie Test {

    private List<Bogie> getSampleBogies() {
        return Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 48),
                new Bogie("Executive AC", 80)
        );
    }

    @Test
    public void testFilter_CapacityGreaterThanThreshold() {
        List<Bogie> bogies = getSampleBogies();
        List<Bogie> result = bogies.stream()
                .filter(b -> b.capacity > 70)
                .collect(Collectors.toList());

        assertEquals(2, result.size());
    }

    @Test
    public void testFilter_CapacityEqualToThreshold() {
        List<Bogie> bogies = getSampleBogies();
        List<Bogie> result = bogies.stream()
                .filter(b -> b.capacity > 72)
                .collect(Collectors.toList());

        assertTrue(result.isEmpty());
    }

    @Test
    public void testFilter_CapacityLessThanThreshold() {
        List<Bogie> bogies = getSampleBogies();
        List<Bogie> result = bogies.stream()
                .filter(b -> b.capacity > 100)
                .collect(Collectors.toList());

        assertEquals(0, result.size());
    }

    @Test
    public void testFilter_MultipleBogiesMatching() {
        List<Bogie> bogies = getSampleBogies();
        List<Bogie> result = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        assertEquals(2, result.size());
    }

    @Test
    public void testFilter_NoBogiesMatching() {
        List<Bogie> bogies = getSampleBogies();
        List<Bogie> result = bogies.stream()
                .filter(b -> b.capacity > 200)
                .collect(Collectors.toList());

        assertTrue(result.isEmpty());
    }

    @Test
    public void testFilter_AllBogiesMatching() {
        List<Bogie> bogies = getSampleBogies();
        List<Bogie> result = bogies.stream()
                .filter(b -> b.capacity > 40)
                .collect(Collectors.toList());

        assertEquals(bogies.size(), result.size());
    }

    @Test
    public void testFilter_EmptyBogieList() {
        List<Bogie> bogies = new ArrayList<>();
        List<Bogie> result = bogies.stream()
                .filter(b -> b.capacity > 50)
                .collect(Collectors.toList());

        assertTrue(result.isEmpty());
    }

    @Test
    public void testFilter_OriginalListUnchanged() {
        List<Bogie> bogies = getSampleBogies();
        List<Bogie> result = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        assertEquals(4, bogies.size()); // Original must remain unchanged
    }
}