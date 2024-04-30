package arief.mahendra.stream.question;

import java.util.Comparator;
import java.util.List;

public class ProblemSolving {
    public static void main(String[] args) {
        averageInt();
        lowerOrUpper();
        sumAllOfEvenOrOdd();
        removeDuplicate();
        countNumOfStringWithSpecificLetter();
        sortingElement();
        findMaxOrMin();
        findTheSecondMaxElement();
    }

    public static void averageInt(){
        List<Integer> nums = List.of(6, 6);
        System.out.println(nums);

        var average = nums.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println("average " + average);
    }

    public static void lowerOrUpper(){
        List<String> names  = List.of("Arief", "Mahendra", "Kelas");

        System.out.println("Before Upper or Lower");
        System.out.println(names);
        System.out.println("After uppercase");
        List<String> stringList = names.stream().map(String::toUpperCase).toList();
        System.out.println(stringList);
        System.out.println("After lowercase");
        List<String> list = names.stream().map(String::toLowerCase).toList();
        System.out.println(list);
    }

    public static void sumAllOfEvenOrOdd(){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(value -> value)
                .sum();

        System.out.println("jumlah nilai genap adalah : " + sum);

        int sum1 = numbers.stream()
                .filter(num -> num % 2 != 0)
                .mapToInt(x -> x)
                .sum();
        System.out.println("jumlah nilai Ganjil adalah : " + sum1);
    }

    public static void removeDuplicate(){
        List<Integer> numbers = List.of(1, 1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8);

        List<Integer> list = numbers.stream()
                .distinct().toList();

        System.out.println(list);
    }

    public static void countNumOfStringWithSpecificLetter(){
        List<String> words = List.of("hello", "makan", "minum", "tidur", "olahraga", "nonton film", "ngoding", "maen game");
        long count = words.stream()
                .filter(word -> word.startsWith(String.valueOf('m')))
                .count();

        System.out.println(count);
    }

    public static void sortingElement(){
        List<String> words = List.of("hello", "makan", "minum", "tidur", "olahraga", "nonton film", "ngoding", "maen game");
        List<String> collect = words.stream()
                .sorted().toList();

        System.out.println(collect);

        List<String> reverse = words.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(reverse);
    }

    public static void findMaxOrMin(){
        List<Integer> numbers = List.of(1, 1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8);

        // ascending
        Integer i = numbers.stream().max(Integer::compareTo).orElse(null);
        System.out.println(i);

        // descending
        Integer i1 = numbers.stream().min(Integer::compareTo).orElse(null);
        System.out.println(i1);
    }

    public static void findTheSecondMaxElement(){
        List<Integer> nums = List.of(1, 4, 3, 56, 6, 7, 8, 4, 6, 4, 3, 4, 5, 6, 4, 5, 7, 8, 7, 5, 4, 3, 30);

        Integer i = nums.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1L)
                .findFirst()
                .orElse(null);

        System.out.println("the second largest : " + i);

        Integer smallest = nums.stream()
                .distinct()
                .sorted(Comparator.naturalOrder())
                .skip(1L)
                .findFirst()
                .orElse(null);

        System.out.println("the second smallest : " + smallest);
    }
}
