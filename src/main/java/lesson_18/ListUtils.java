package lesson_18;

import java.util.List;

public class ListUtils {

    public static <T> T findBest(List<T> list,T initialValue, Decider<T> decider){
        T accum = initialValue;
        for (T e : list) {
            if (decider.isBetter(e, accum) ) {
                accum = e;
            }
        }
        return accum;
    }
}
