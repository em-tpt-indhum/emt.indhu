package src.codethone04_IndhuM;
import java.util.Scanner;
interface  LExpression{
    public boolean Landa(int a);   //To implemnt Landa Expression to declare interface
}
public class CodethoneFour {
    public static void main(String[] args)  {
        LExpression isOdd=a->{     //Landa Expresion check isOdd
            if(a%2==0)
            {
                return false;
            }
            else
            {
                return true;
            }
        };
        LExpression isPrime=a->{
            if (a <= 1) {
                return false;
            } else if (a <= 3) {
                return true;
            } else if (a % 2 == 0 || a % 3 == 0) {
                return false;
            }
            int i = 5;
            while (i * i <= a) {
                if (a % i == 0 || a % (i + 2) == 0) {
                    return false;
                }
                i += 6;
            }
            return true;
        };
        LExpression isPalindrome=a->{
            int b=a; int c=0;int d=0;
            while(a!=0)
            {
                d=a%10;
                c=c*10+d;
                a=a/10;
            }
            if(c==b)
            {
                return true;
            }
            else{
                return false;
            }
        };
        Scanner sc=new Scanner(System.in);
        //     System.out.println("Enter a Value ");
        int value=sc.nextInt();
        //    System.out.println("Give a value \n if 1 then it return odd or even if 2 then it return prime or not if 3 it return palindrome or not");
        int select=sc.nextInt();
        switch (select)
        {
            case 1:
                if (isOdd.Landa(value)) {
                    System.out.println("Odd");
                } else {
                    System.out.println("Even");
                }
                break;
            case 2:
                if(isPrime.Landa(value))
                    System.out.println("Prime");
                else
                    System.out.println("Not Prime");
                break;
            case 3:
                if(isPalindrome.Landa(value))
                    System.out.println("Palindrome");
                else
                    System.out.println("Not Palindrome");
        }
    }
}






