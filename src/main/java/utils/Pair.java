package utils;

import lombok.Value;

@Value
public class Pair<T, K> {
    T first;
    K second;
}
