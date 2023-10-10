package lesson_18;

public interface Decider<T> {
    boolean isBetter(T first, T second);

}
