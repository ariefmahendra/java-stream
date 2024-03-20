package arief.mahendra.stream;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    void testCreateEmptyOrSingleStream() {

        // stream kosong
        Stream<String> emptyStream = Stream.empty();

        // membuat satu data di stream
        Stream<String> singleStream = Stream.of("Arief");

        // membuat stream yang datanya bisa null
        Stream<String> nullableStream = Stream.ofNullable(null);

    }

    @Test
    void testCreateStreamFromArray() {

        // membuat stream dengan variadik argument
        Stream<String> names = Stream.of("Arief", "Mahendra");

        names.forEach(System.out::println);

        // membuat stream dari variadik argument integer
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.forEach(System.out::println);

        String[]  array = new String[]{
          "Helo", "world"
        };

        // membaut stream dari sebuah object array yang sudah ada
        Stream<String> streamArray = Arrays.stream(array);

        streamArray.forEach(System.out::println);
    }

    @Test
    void testCreateStreamFromCollection() {
        Collection<String> collection = List.of("Arief", "Mahendra");
        Stream<String> stringStream = collection.stream();
        stringStream.forEach(System.out::println);
    }

    @Test
    void testCreateInfiniteStream() {
        Stream<String> stream1 = Stream.generate(() -> "Arief");

        // contoh di bawah kita mempunyai initial value yaitu 1
        Stream<Integer> stream2 = Stream.iterate(1, integer -> integer + 1);
    }
}
