package taskTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class MainTaskTwo {
    public static void main(String[] args) {

        List<Number> numberList = List.of(new Number(1), new Number(2),
                new Number(5), new Number(6), new Number(8),
                new Number(9), new Number(11), new Number(12), new Number(18));
        System.out.println();
        System.out.println("Количество четных чисел в списке: " + taskTwoQuantity(numberList));
        System.out.println("Это числа: ");
        taskTwoEvenNum(numberList);

}

    private static int taskTwoQuantity(List<Number> numberList) {
        return (int) numberList
                .stream()
                .filter(n -> n.getNum() % 2 == 0)
                .count();
    }

    private static void taskTwoEvenNum(List<Number> numberList) {
        numberList
                .stream()
                .filter(n -> n.getNum() % 2 == 0)
                .forEach(System.out::println);

    }
}

