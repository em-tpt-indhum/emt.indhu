package src;

import java.util.Scanner;

public class CodethoneThree {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. Of Trees : ");
        int noOfTree= sc.nextInt();
        int tree[]=new int[noOfTree];
        for(int i=0;i<noOfTree;i++)
        {
            tree[i]= sc.nextInt();
        }
        int maxArray=0;
        maxArray=maximumValueOfArray(tree);

        int clockwise[]=new int[noOfTree];
        int anticlockwise[]=new int[noOfTree];
        int index=findIndex(tree,maxArray);

        int maxCWise=0;
        int maxACwise=0;
        int cw=0;
        int aw=0;
        int clockWise[]=new int[noOfTree];

        for(int i=0;i<noOfTree;i++)//clockwise
        {

            int fix=index;
            int inde=findIndex(tree,tree[i]);
            if(fix!=inde) {
                if (fix < inde) {
                    cw = inde - fix;
                    clockWise[i]=cw+tree[i]+maxArray;

                }
                else {
                    cw=noOfTree-fix+inde;
                    clockWise[i]=cw+tree[i]+maxArray;
                }
            }

        }
        maxCWise=maximumValueOfArray(clockWise);


        for(int i=0;i<noOfTree;i++)//Anticlockwise
        {

            int fix=index;
            int inde=findIndex(tree,tree[i]);
            if(fix!=inde) {
                if (fix < inde) {
                    aw =fix+noOfTree-inde;
                    anticlockwise[i]=aw+tree[i]+maxArray;

                }
                else {
                    aw=fix-inde;
                    anticlockwise[i]=aw+tree[i]+maxArray;
                }
            }

        }
        maxACwise=maximumValueOfArray(anticlockwise);

        int maximumTravelPath=Math.max(maxCWise,maxACwise);
        System.out.println(maximumTravelPath);

    }
    private static int findIndex(int [] arr,int j)
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
    private static int maximumValueOfArray(int[] a)
    {int maxArray=0;
        for(int i=0;i<a.length;i++)
        {
            maxArray=Math.max(maxArray,a[i]);
        }
        return maxArray;
    }
}

