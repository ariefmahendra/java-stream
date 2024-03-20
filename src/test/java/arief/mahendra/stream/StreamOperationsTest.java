package arief.mahendra.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamOperationsTest {
    @Test
    void testStreamOperations() {
        List<String> names = List.of("Arief", "Mahendra", "Junaidi");
        Stream<String> nameStream = names.stream();
        Stream<String> stringStream = nameStream.map(name -> name.toUpperCase());

        // akan menjadi value yang aslinya
        names.forEach(System.out::println);

        // akan menjadi sebuah object baru, bukan diambil dari yang lama
        stringStream.forEach(System.out::println);

    }
}
