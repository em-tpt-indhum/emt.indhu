package src.codethone08_IndhuM;
public class cricketer {
    String teamName;
    String playerName;
    int balls;
    int extra;
    int[] everyBallRun;
    int totalRun;
    cricketer(String team,String player)
    {
        teamName=team;
        playerName=player;
        everyBallRun=new int[60];
    }

}

