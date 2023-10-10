package hW;

public class HW_13_2 {
    public  static int add  (int a, int b){
        return a+b;
    }
    public  int mult ( int a,  int  b){
        return  a * b ;

    }
    public    int sub( int a,  int b){
        return  a - b;
    }
    public    double div( int a , int b){
        if ( b == 0 ){
            throw new  IllegalArgumentException("Деление на ноль делать не надо");
        }
        return (double) a/b;
    }
}
