package taskTwo;

import java.util.stream.Stream;

public class MainTaskTwo {
    public static void main(String[] args) {
        System.out.println();
        taskTwo();
    }

    private static void taskTwo() {
        Stream.iterate(2, i -> i + 2).limit(12)
                .forEach(System.out::println);
    }
}