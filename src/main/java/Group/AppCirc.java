package Group;

public class AppCirc {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.square(5));

        Rectangle rectangle = new Rectangle(5,10);



        System.out.println("First Rectangle "+ rectangle.calculateArea());
        System.out.println("First Rectangle " + rectangle.calculatePerimeter());

        Rectangle rectangle1 = new Rectangle();
        rectangle1.height = 15;
        rectangle1.width = 20;

        System.out.println("Second Rectangle " + rectangle1.calculatePerimeter());
        System.out.println("Second Rectangle " + rectangle1.calculateArea());


        String [] arr = new String[3];
        System.out.println(arr[0]);
     }
}
