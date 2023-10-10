package Interf;

import java.util.*;

public class Main {
    public  static  void printName(IName named){
        System.out.println(named.getName());

    }


    public static void main(String[] args) {

        Pet pet = new Pet("Dog", "Lucy");
        Person person = new Person("Sergey",30);

        printName(pet);
        printName(person);
        IName [] arr = {pet,person};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i].getName());

        }


       List <String>list  = new ArrayList<String>();

        list.add("Sergey");
        list.add("Anna");
        list.add("Lucy");


        System.out.println(list);

        list.remove(2);
        System.out.println(list);
        String sName = list.get(0);


        List <Integer>ilist= new ArrayList<Integer>();

        ilist.add(1);
        ilist.add(2);
        ilist.add(3);

        System.out.println(ilist);

        List <Person> listp = new ArrayList<>();
        listp.add(new Person("Artuom",20));


        System.out.println("Имя: " + person.getName());
        System.out.println("Возраст: " + person.getAge());



        for (Person person1 : listp) {
            System.out.println(person1);
        }
        for (int i = 0; i < listp.size(); i++) {
            System.out.println("Имя: " + person.getName());
            System.out.println("Возраст: " + person.getAge());
        }


        Set<String> set = new HashSet<>();
        set.add("Sergey");
        set.add("Anna");
        set.add("Lusy");
        set.add("Anna");
        System.out.println(set);


        Map<String,Integer>map = new HashMap<>();
        map.put("Sergey",30);
        map.put("Anna",15);
        map.put("Lucy",25);
        map.put("Anna",18);
        map.put("Lucy",37);
        System.out.println(map);


    }


}