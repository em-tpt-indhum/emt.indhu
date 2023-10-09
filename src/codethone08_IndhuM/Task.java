package src.codethone08_IndhuM;

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
        int b=0;
        int ext=0;
        int totalRan=0;

        for(int i=0;i<11;i++)
        {
            c[i]=new cricketer(teamName,playerName[i]);
            totalRan=0;
            int ballLen=0;
            ext=0;
            for(int j=0;b<60;j++)           //Apply condition within 60 balls i.e.,10 over only
            {
                double a=Math.random()*10;
                int ran=(int)a%8;            //Randomly select value from 0 to 7
                b++;                          //store how many over
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
        double over=((double)b/6);
        System.out.println("\n Total Score = "+totalScore+" Over="+(int)(Math.round(over * 10))/10.0);

    }
    void Display(cricketer player)
    {
        System.out.print(player.playerName+"  (");
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
        System.out.print(")="+player.totalRun+"("+player.balls+")   (extra = "+player.extra+")");
        System.out.println();
    }
}
