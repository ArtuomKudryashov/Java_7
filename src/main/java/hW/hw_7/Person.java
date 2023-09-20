package hW.hw_7;

public class Person {
    private String name;
    private int age;
    private String gender;


    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        if (gender.equals("Мужской")) {
            return "Mr. " + name;
        } else if (gender.equals("Женский")) {
            return "Mrs. " + name;
        } else {
            return name;
        }


    }


}
