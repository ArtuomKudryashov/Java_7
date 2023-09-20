package hW;

public class HW_3 {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;

        if (a==b){
            System.out.println("a==b");
        } else if (a<b) {
            System.out.println("a<b");

        }else{
            System.out.println("a>b");
        }
        System.out.println("Task#2");

        int c =3562;
        if (c>10){
            System.out.println("Больше 10");
        }
        if(c<100){
            System.out.println("меньше 100");
        }
        if(c/2>20){
            System.out.println("Результат деления на 2 больше 20");
        }
        if(c>=5&&c<40 ){
            System.out.println("значение переменной между 5 и 40 включительно ");
        }
        if(c<5||c>40){
            System.out.println("значение переменной меньше 5 или больше 40");
        }

        int d=18;
        int e=10;
        if ((d+e)%2!=1){
            System.out.println("maybe a and b are even or odd");
        }
        if(((d+e)%2==1)){
            System.out.println("some variable is odd ");
        }
    }

}
