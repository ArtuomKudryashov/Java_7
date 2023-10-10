package lesson_18;

public class App {
    public static void main(String[] args) {
        Month month = Month.March;
        System.out.println(fromName("April"));
        System.out.println(Month.September.getNumOfDays());
        System.out.println(Month.May.compareTo(Month.January));
    }

    public void doSomething(Month month){
        System.out.println(month);
    }
    public static Month fromName(String name){
        return Month.valueOf(name);

    }

}
