package com.example.Cricket;

import com.example.Cricket.entity.Player;
import com.example.Cricket.entity.Team;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Component
public class Utility {

    Random decision = new Random();

    public Team toss(Team team1, Team team2) {
        int tossWinner = decision.nextInt(2);
        if (tossWinner == 0) {
            System.out.println(team1.getName() + " has won the toss, Please enter 1 for batting or 2 for bowling");
            return team1;
        } else {
            System.out.println(team2.getName() + " has won the toss, Please enter 1 for batting or 2 for bowling");
            return team2;
        }
    }

    public void matching(Team team , Team team2 , int target) {
        int wickets = 0;
        int j=0;
        int currentPlayerScore=0;
        int fours=0;
        int six=0;
        while(j<10) {
            //            For debugging
            //            team.display();
            //            team2.display();

            for (int i = 0; i < 6; i++)
            {
                List<Player> bowlingPlayers = team2.getPlayers();
                Player bowler = bowlingPlayers.get(4-(j%5));
                bowler.setTotalBallsDelivered(bowler.getTotalBallsDelivered() + 1);
                // System.out.println(bowler.getName()+" ballDelivered "+bowler.getTotalBallsDelivered()+"\n");
                int ballResult = decision.nextInt(7) + 1;
                if(ballResult==4){
                    fours++;
                }
                else if(ballResult==6)
                {
                    six++;
                }
                else if (ballResult == 7) {
                    List<Player>  players =  team.getPlayers();
                    Player p = players.get(wickets);
                    p.setName(players.get(wickets).getName());
                    p.setBattingScore(currentPlayerScore);
                    p.setTotal4s(fours);
                    p.setTotal6s(six);
                    players.set(wickets,p);
                    team.setPlayers(players);
                    wickets++;
                    currentPlayerScore=0;
                    fours=0;
                    six=0;
                    bowler.setBowlingWickets(bowler.getBowlingWickets()+1);
                    // System.out.println(bowler.getName()+" wicket "+bowler.getBowlingWickets()+"\n");
                    bowlingPlayers.set(4-(j%5),bowler);
                    team2.setPlayers(bowlingPlayers);

                    if (wickets == 5) {
                        return ;
                    }
                    continue;
                }
                bowlingPlayers.set(4-(j%5),bowler);
                team2.setPlayers(bowlingPlayers);

                team.setScore(team.getScore() + ballResult);
                currentPlayerScore+=ballResult;
                if (team.getInning() == 2 && team.getScore() >= target) {
                    List<Player>  players =  team.getPlayers();
                    Player p = players.get(wickets);
                    p.setName(players.get(wickets).getName());
                    p.setBattingScore(currentPlayerScore);
                    p.setTotal4s(fours);
                    p.setTotal6s(six);
                    players.set(wickets,p);
                    team.setPlayers(players);
                    return;
                }
            }
            j++;
        }
        if(wickets<5)
        {
            List<Player>  players =  team.getPlayers();
            Player p = players.get(wickets);
            p.setName(players.get(wickets).getName());
            p.setBattingScore(currentPlayerScore);
            p.setTotal4s(fours);
            p.setTotal6s(six);
            players.set(wickets,p);
            team.setPlayers(players);
        }
    }

    public void loading() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
                System.out.print(".");
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("");
    }
}

