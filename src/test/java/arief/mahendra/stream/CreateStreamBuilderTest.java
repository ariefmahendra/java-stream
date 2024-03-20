package arief.mahendra.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CreateStreamBuilderTest {

    @Test
    void testCreateStreamBuilder() {

        Stream.Builder<String> builder = Stream.builder();

        // method accept return void
        builder.accept("Arief");

        // method add return builder itu sendiri sehingga dapat di chaining
        builder.add("Eko").add("Khannedy");

        // builder di build dan akan return Stream
        Stream<String> stream = builder.build();

        // panggil builder
        stream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamBuilderSimplify() {
        Stream<Object> stream = Stream.builder().add("Arief").add("mahendra").build();
        stream.forEach(System.out::println);

    }
}
