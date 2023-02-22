package com.example.Cricket.services;

import com.example.Cricket.Utility;
import com.example.Cricket.entity.ScoreBoard;
import com.example.Cricket.entity.Team;
import com.example.Cricket.repo.ScoreBoardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchService {
    @Autowired
    public ScoreBoard scoreBoard;
    @Autowired
    public ScoreBoardRepo scoreBoardRepo;
    @Autowired
    public Utility utility;
    public ScoreBoard startMatching(Team team1, Team team2,Integer choiceAfterToss){
//        System.out.println(team1);
//        System.out.println(team2);
//        System.out.println("Choice after toss is "+choiceAfterToss);
        Team tossWinner = utility.toss(team1, team2);
        Team tossLoser;
        if (tossWinner == team1) {
            tossLoser = team2;
        } else {
            tossLoser = team1;
        }
//        System.out.println(tossLoser);
//        System.out.println(tossWinner);
        if (choiceAfterToss == 1) {
            tossWinner.setInning(1);
            tossLoser.setInning(2);
            utility.matching(tossWinner, tossLoser, 0);
//            System.out.println(tossWinner.getName() + " scored " + tossWinner.getScore());

//            System.out.println("target for " + tossLoser.getName() + " is " + (tossWinner.getScore() + 1)+"\n");
            utility.matching(tossLoser, tossWinner, tossWinner.getScore() + 1);
//            System.out.println(tossLoser.getName() + " scored " + tossLoser.getScore());
            System.out.println();

        } else {
            tossLoser.setInning(1);
            tossWinner.setInning(2);
            utility.matching(tossLoser, tossWinner, 0);
            System.out.println(tossLoser.getName() + " scored " + tossLoser.getScore());
            //    utility.loading();

            System.out.println("target for " + tossWinner.getName() + " is " + (tossLoser.getScore() + 1)+"\n");

            utility.matching(tossWinner, tossLoser, tossLoser.getScore() + 1);
            //   utility.loading();
            System.out.println(tossWinner.getName() + " scored " + tossWinner.getScore());

        }

        if (tossWinner.getScore() > tossLoser.getScore()) {
            scoreBoard.setWinningTeam(tossWinner);
            scoreBoard.setLossingTeam(tossLoser);
        } else if (tossWinner.getScore() < tossLoser.getScore()) {
            scoreBoard.setWinningTeam(tossLoser);
            scoreBoard.setLossingTeam(tossWinner);
        } else {
            System.out.println("Match tied");
        }
        return scoreBoardRepo.save(scoreBoard);

    }
}
