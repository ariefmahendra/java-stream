package arief.mahendra.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class FilterOperationTest {

    @Test
    void testFilterOperation() {

        List<String> names = List.of("Arief", "Mahendra", "Juan", "Adilla", "Fahri", "Fahri", "Juan");

        System.out.println("Filter Method");
        names.stream().filter(name -> name.length() > 5).forEach(System.out::println);

        System.out.println();
        System.out.println("Distinct Method");
        names.stream().distinct().forEach(System.out::println);
    }
}
