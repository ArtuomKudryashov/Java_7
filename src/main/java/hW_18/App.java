package hW_18;

import lesson_18.Decider;
import lesson_18.ListUtils;

import java.time.DayOfWeek;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Decider<Integer> isMore = new Decider<Integer>() {
            @Override
            public boolean isBetter(Integer first, Integer second) {
                return first > second;
            }
        };

        Decider<Integer> isLess = new Decider<Integer>() {
            @Override
            public boolean isBetter(Integer first, Integer second) {
                return first < second;
            }
        };
        List<Integer> ints = List.of(1, 2, 4, 0, -49);
        System.out.println(ListUtils.findBest(ints, Integer.MIN_VALUE, isMore));
        System.out.println(ListUtils.findBest(ints, Integer.MAX_VALUE, isLess));

        Decider<Double> isMored = new Decider<Double>() {
            @Override
            public boolean isBetter(Double first, Double second) {
                return first > second;
            }
        };

        Decider<Double> isLessd = new Decider<Double>() {
            @Override
            public boolean isBetter(Double first, Double second) {
                return first < second;
            }
        };
        List<Double> intsd = List.of(12.0, -14.2, 90990.3224);
        System.out.println(ListUtils.findBest(intsd, Double.MIN_VALUE, isMored));
        System.out.println(ListUtils.findBest(intsd, Double.MAX_VALUE, isLessd));


        List<String> month = List.of("Иван", "родил", "девчонку", "веле", "тащить", "пеленку");



        Decider<String> isLonger = new Decider<>(){

            @Override
            public boolean isBetter(String first, String second) {
                return first.length() > second.length();
            }
        };
        System.out.println(ListUtils.findBest(month,"",isLonger));

        List<DayOfWeek> daysOfWeek = List.of(
                DayOfWeek.MONDAY,
                DayOfWeek.WEDNESDAY,
                DayOfWeek.TUESDAY
        );

        Decider<DayOfWeek> isLongerName = new Decider<DayOfWeek>() {
            @Override
            public boolean isBetter(DayOfWeek first, DayOfWeek second) {

                return first.toString().length() > second.toString().length();
            }
        };

        System.out.println(ListUtils.findBest(daysOfWeek, DayOfWeek.MONDAY, isLongerName));
    }





}
