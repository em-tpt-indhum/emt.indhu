package src.codeEight;

import java.util.Date;

public class CricketScoreBoard {
    public static void main(String arg[])  {
        String team1[]={"Rohit Sharma", "Shubman Gill", "Virat Kohli", "KL Rahul", "Ishan Kishan",
                "Hardik Pandya", "Ravindra Jadeja", "Washington Sundar", "Kuldeep Yadav",
                "Mohammed Siraj", "Jasprit Bumrah"};
        String team2[]={"Pathum Nissanka", "Kusal Perera", "Kusal Mendis", "Sadeera Samarawickrama",
                "Charith Asalanka", "Dhananjaya de Silva", "Dasun Shanaka", "Dunith Wellalage",
                "Dushan Hemantha", "Pramod Madushan", "Matheesha Pathirana"};
        Task india=new Task("India",team1);
        Task sriLanka=new Task("Sri Lanka",team2);
        Thread T1=new Thread(india);
        Thread T2=new Thread(sriLanka);
        double random=Math.random()*10;
        double toss=random%2;   //toss value select randomly
        for(int i=0;i<2;i++)
        {
            if(toss>0&&toss<1)
            {
                if(i==0)
                {
                    System.out.println("India Batting first");
                }
                else {
                    System.out.println("\nIndia Batting Second");
                }
                T1.start();
                try{T1.join();}    //Wait untill the thread dead
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                toss=1.5;

            }
            else {
                if(i==0)
                {
                    System.out.println("Sri Lanka Batting first");
                }
                else {
                    System.out.println();
                    System.out.println("Sri Lanka Batting Second");
                }
                T2.start();
                try{T2.join();}  //Wait untill the thread dead
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                toss=0.5;

            }
        }
        if(india.totalScore>sriLanka.totalScore)
        {
            System.out.println("India Won By  "+(india.totalScore- sriLanka.totalScore));
            System.out.println("Today = "+new Date());   //Here match date print Here Date format Day MMM DD HH:MM:SS IST YYYY
        }
        if(sriLanka.totalScore> india.totalScore)
        {
            System.out.println("Sri Lanka Won By  "+(sriLanka.totalScore- india.totalScore));
            System.out.println("Today = "+new Date());//Here match date print Here Date format Day MMM DD HH:MM:SS IST YYYY
        }

    }
}
