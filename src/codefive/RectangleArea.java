package src.codefive;
import java.util.Scanner;

public class RectangleArea extends Rectangle {
    public void read_method() {
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
        width = sc.nextInt();
    }

    public void display() {
        System.out.println(height * width);
    }
}
