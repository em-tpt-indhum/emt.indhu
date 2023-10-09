package src.codeEight;

import java.util.Random;

public class Task implements Runnable{
    String teamName;
    String playerName[];
    int totalScore=0;
    int everyRan[];
    cricketer c[];

    Task(String team,String player[])
    {
        teamName=team;
        playerName=player;
        everyRan=new int[60];
        c=new cricketer[11];
    }
    @Override
    public void run() {
        Random random=new Random(2);
        int b=0;
        int ext=0;
        int totalRan=0;

        for(int i=0;i<11;i++)
        {
            c[i]=new cricketer(teamName,playerName[i]);
            totalRan=0;
            int ballLen=0;
            ext=0;
            for(int j=0;b<60;j++)
            {
//                int ran = random.nextInt(8);
                double a=Math.random()*10;
                int ran=(int)a%8;
                b++;
                ballLen++;
                totalRan=totalRan+ran;
                if(ran==7)
                {
                    ext++;
                    ran=6;
                }
                everyRan[j]=ran;

                if(ran==0)
                {
                    break;
                }
            }
            if(ballLen==0)
            {
                c[i].everyBallRun= new int[]{0, 0, 0};
            }
            else {
                c[i].everyBallRun=everyRan;
            }
            c[i].balls=ballLen;
            c[i].extra=ext;
            c[i].totalRun=totalRan;

            Display(c[i]);
        }

        for(int i=0;i<10;i++)
        {
            totalScore=totalScore+c[i].totalRun;
        }
        System.out.println("\n Total Score = "+totalScore+" Over="+((float)b/6));

    }
    void Display(cricketer player)
    {
        System.out.print(player.playerName+" "+player.balls+"(");
        for(int i=0;i<60;i++)
        {
            System.out.print(player.everyBallRun[i]);
            if(player.everyBallRun[i]==0)
            {break;
            }
            else{
                System.out.print(",");
            }
        }
        System.out.print(")="+player.totalRun+"  (extra = "+player.extra+")");
        System.out.println();
    }
}

