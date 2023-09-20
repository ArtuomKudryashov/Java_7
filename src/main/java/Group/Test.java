package Group;

public class Test {
    public static void main(String[] args) {
        String str = "А роза  упала на лапу Азора";

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='а' ) {
                System.out.println(i);

            }

        }
        System.out.println(str.length());
    }
}
