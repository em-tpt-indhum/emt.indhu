package src.codefive;

import java.util.Scanner;
public class swap2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("var1=");
        int a=sc.nextInt();
        System.out.print("var2=");
        int b=sc.nextInt();
        a=(a*20)/100;
        b=(b*10)/100;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("var1="+a+", var2="+b);
    }
}