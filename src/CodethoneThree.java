package src;

import java.util.Scanner;

public class CodethoneThree {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. Of Trees : ");
        int noOfTree= sc.nextInt();                   //No. Of trees given
        int limit=(int)Math.round((double)noOfTree/2);
        //System.out.println(limit);
        int tree[]=new int[noOfTree];
        for(int i=0;i<noOfTree;i++)
        {
            tree[i]= sc.nextInt();      //trees value given at runtime
        }
        int maxArray=0;
        maxArray=maximumValueOfArray(tree);

        int anticlockwise[]=new int[noOfTree];
        int index=findIndex(tree,maxArray);

        int maxCWise=0;
        int maxACwise=0;
        int cw=0;
        int aw=0;
        int clockWise[]=new int[noOfTree];
        int fix=index;
        int inde=fix;

        for(int i=0;i<limit;i++)  //clockwise
        {
            inde=inde+1;
            if(index>noOfTree)
            {
                inde=0;
            }
            if(fix!=inde&&inde<noOfTree) {
                if (fix < inde) {
                    cw = inde - fix;
                    clockWise[i]=cw+tree[inde]+maxArray;

                }
                else {
                    cw=noOfTree-fix+inde;
                    clockWise[i]=cw+tree[inde]+maxArray;
                }
            }

        }
        maxCWise=maximumValueOfArray(clockWise);

        inde=fix;
        for(int i=0;i<Math.round(noOfTree/2);i++)//Anticlockwise
        {
            inde=inde-1;
            if(inde<0)
            {
                inde=noOfTree-1;
            }

            if(fix!=inde&&inde>0) {
                if (fix < inde) {
                    aw =fix+noOfTree-inde;
                    anticlockwise[i]=aw+tree[inde]+maxArray;

                }
                else {
                    aw=fix-inde;
                    anticlockwise[i]=aw+tree[inde]+maxArray;
                }
            }

        }
        maxACwise=maximumValueOfArray(anticlockwise);

        int maximumTravelPath=Math.max(maxCWise,maxACwise);
        System.out.println(maximumTravelPath);     //Print max travelling path

    }
    private static int findIndex(int [] arr,int j)  //return index of specific value in an array
    {
        for(int i=0;i<arr.length;i++)
        {
            // comparing element to the target element
            if(arr[i]==j)
            {
                return i;

            }
        }
        return -1;

    }
    private static int maximumValueOfArray(int[] a)   //Maximum value of an array
    {int maxArray=0;
        for(int i=0;i<a.length;i++)
        {
            maxArray=Math.max(maxArray,a[i]);
        }
        return maxArray;
    }
}
