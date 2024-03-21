package arief.mahendra.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class AggregateOperationTest {

    @Test
    void testAggregateOperations() {

        List<String> names = List.of("Arief", "Mahendra", "Juan", "Adilla", "Fahri", "Fahri", "Juan");

        Optional<String> max = names.stream().max(Comparator.naturalOrder());
        Optional<String> min = names.stream().min(Comparator.naturalOrder());
        long count = names.stream().count();

        max.ifPresent(System.out::println);
        min.ifPresent(System.out::println);
        System.out.println(count);
    }

    @Test
    void testSum() {

        Integer sum = List.of(1, 2, 3, 4, 5).stream()
                .reduce(0, (value, item) -> value + item);

        System.out.println(sum);

        // 0 =>
        // 1 => value = 0, item = 1 => 1
        // 2 => value = 1, item = 2 => 3
        // 3 => value = 3, item = 3 => 6
        // 4 => value = 6, item = 4 => 10
        // 5 => value = 10, item = 5 => 15
    }

    @Test
    void testFactorial() {

        Integer factorial = List.of(1, 2, 3, 4, 5).stream()
                .reduce(1, (value, item) -> value * item);

        System.out.println(factorial);

    }
}
