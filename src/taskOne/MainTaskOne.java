package taskOne;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class MainTaskOne {
    public static void main(String[] args) {
        System.out.println();
        findMinMax(Stream.empty(), Comparator.naturalOrder(), (min, max) ->
                System.out.println("min = " + min + ";\n" + "max = " + max + "."));
        System.out.println();
    }

    public static void findMinMax(Stream<? extends Integer> stream,
                                  Comparator<? super Integer> order,
                                  BiConsumer<? super Integer, ? super Integer> minMaxConsumer) {
        List<Integer> integers = stream.map(Integer::valueOf).toList();
        Integer min = integers.stream().min(order).orElse(null);
        Integer max = integers.stream().max(order).orElse(null);
        if (min == null) {
            minMaxConsumer.accept(null, null);
        } else {
            minMaxConsumer.accept(min, max);
        }
    }
}
