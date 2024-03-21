package arief.mahendra.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingOperationTest {

    @Test
    void testOrderingOperation() {

        List<String> names = List.of("Arief", "Mahendra", "Juan", "Adilla", "Fahri", "Fahri", "Juan");


        names.stream().sorted().forEach(System.out::println);
        names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
