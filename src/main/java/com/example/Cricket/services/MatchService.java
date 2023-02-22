package com.example.Cricket.services;

import com.example.Cricket.Utility;
import com.example.Cricket.entity.Team;
import com.example.Cricket.repo.ScoreBoardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchService {
    @Autowired
    public ScoreBoardRepo scoreBoardRepo;
    @Autowired
    public Utility utility;
    public void startMatching(Team team1, Team team2,Integer choiceAfterToss){
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
    }
}
