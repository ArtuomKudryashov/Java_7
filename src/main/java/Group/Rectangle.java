package Group;

public class Rectangle {
    public int  width;
    public  int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
     public int calculateArea(){
        return  width* height;
     }
     public int calculatePerimeter(){
        return 2*(width+height);
     }

    public Rectangle() {
    }

}
