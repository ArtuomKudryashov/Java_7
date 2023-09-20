package hW;

public class helper {
    public static void task(int a) {
        String t = "<<<<<<<<<<<<<<<<<<<<<<< ";
        String task = "Task #";
        String b = ">>>>>>>>>>>>>>>>>>>>>>>";
        System.out.println(t + task + a + b);

        /**
         * Сумма 2-х  мерного массива
         */


    }

    public static void sumDub(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];

            }

        }
        System.out.println(sum);
    }

    public static void maxDub(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }


            }

        }

        System.out.println(max);
    }
    public static void minDub(int[][] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                }


            }

        }

        System.out.println(min);
    }
    public static void countDub(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                count++;


            }

        }

        System.out.println(count);
    }
    public static void sum( int a,  int b){
        System.out.println(a+b);
    }
    public static void subs( int a,  int b){
        System.out.println(a-b);
    }
    public static void mult( int a,  int b){
        System.out.println(a*b);
    }
    public static void divis( int a,  int b) {
        System.out.println(a / b);
    }

}
