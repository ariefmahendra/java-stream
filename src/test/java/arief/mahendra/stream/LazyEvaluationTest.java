package arief.mahendra.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationTest {

    @Test
    void testLazyEvaluation() {
        Stream<String> names = List.of("Arief", "Mahendra").stream();

        names.map(name -> {
            System.out.println("name : " + name + " to uppercase");
            return name.toUpperCase();
        });
    }

    @Test
    void testTerminalOperation() {

        Stream<String> names = List.of("Arief", "Mahendra").stream();

        Stream<String> streamNamesToUpper = names.map(name -> {
            System.out.println("name : " + name + " to uppercase");
            return name.toUpperCase();
        });

        streamNamesToUpper.forEach(System.out::println);
    }
}
