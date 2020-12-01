package utils;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DoubleStream {

    public static <T, K> Stream<Pair<T, K>> of(List<T> first, List<K> second) {
        int maxLength = Math.max(first.size(), second.size());
        return IntStream.range(0, maxLength).mapToObj(i -> new Pair<>(getFromList(first, i), second.get(i)));
    }

    private static <T> T getFromList(List<T> first, int i) {
        try {
            return first.get(i);
        } catch (ArrayIndexOutOfBoundsException exception) {
            return null;
        }
    }

}
