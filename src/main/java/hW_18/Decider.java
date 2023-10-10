package hW_18;
import java.time.DayOfWeek;

public interface Decider<T> {
    boolean isBetter(T first, T second);


}
