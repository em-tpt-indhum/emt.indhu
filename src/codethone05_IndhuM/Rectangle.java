package src.codethone05_IndhuM;

public class Rectangle {
    public int width;
    public int height;
    public void display()
    {
        System.out.println("Height="+height+"   Width="+width);
    }
    public static void main(String[] args) {
        RectangleArea rectangleArea=new RectangleArea();
        rectangleArea.read_method();
        rectangleArea.display();
    }
}

