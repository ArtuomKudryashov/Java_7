package lesson_18;

import java.util.List;

public class App2 {
    public static void main(String[] args) {

        Decider <Integer> isMore = new Decider<Integer>() {
            @Override
            public boolean isBetter(Integer first, Integer second) {
                return first > second;
            }
        };

        Decider <Integer> isLess = new Decider<Integer>() {
            @Override
            public boolean isBetter(Integer first, Integer second) {
                return first < second;
            }
        };
        List<Integer> ints = List.of(1, 3, -90, 200, 31);
        System.out.println(ListUtils.findBest(ints, Integer.MIN_VALUE, isMore));
        System.out.println(ListUtils.findBest(ints, Integer.MAX_VALUE, isLess));


        List<String> month = List.of("January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December");

        Decider <String> isLonger = new Decider <>(){

            @Override
            public boolean isBetter(String first, String second) {
                return first.length() > second.length();
            }
        };
        System.out.println(ListUtils.findBest(month,"",isLonger));
    }

}
