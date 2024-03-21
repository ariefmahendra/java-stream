package arief.mahendra.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetrievingOperationTest {
    @Test
    void testFilterOperation() {

        List<String> names = List.of("Arief", "Mahendra", "Juan", "Adilla", "Fahri", "Fahri", "Juan");

        System.out.println("limit");
        names.stream().limit(2).forEach(System.out::println);

        System.out.println();
        System.out.println("skip");
        names.stream().skip(2).forEach(System.out::println);

        System.out.println();
        System.out.println("takeWhile");
        names.stream().takeWhile(name -> name.length() < 6).forEach(System.out::println);

        System.out.println();
        System.out.println("dropWhile");
        names.stream().dropWhile(name -> name.length() < 6).forEach(System.out::println);
    }

    @Test
    void testRetrievingSingleElement() {

        List<String> names = List.of("Arief", "Mahendra", "Juan", "Adilla", "Fahri", "Fahri", "Juan");

        Optional<String> anyNames = names.stream().findAny();
        Optional<String> firstNames = names.stream().findFirst();

        anyNames.ifPresent(System.out::println);
        firstNames.ifPresent(System.out::println);
    }
}
