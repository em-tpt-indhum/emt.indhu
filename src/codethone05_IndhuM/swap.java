package src.codethone05_IndhuM;

import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("var1=");
        int a=sc.nextInt();
        System.out.print("var2=");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        a=(a*10)/100;
        b=(b*20)/100;
        System.out.println("var1="+a+", var2="+b);
    }
}





