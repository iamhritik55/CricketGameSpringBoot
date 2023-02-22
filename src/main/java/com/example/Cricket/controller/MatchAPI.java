package com.example.Cricket.controller;

import com.example.Cricket.entity.Team;
import com.example.Cricket.services.MatchService;
import com.example.Cricket.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/match")
public class MatchAPI {
    @Autowired
    public MatchService matchService;
    @Autowired
    public TeamService teamService;
    @GetMapping
    public void startMatch(@RequestParam("team1Id") Integer team1Id, @RequestParam("team2Id") Integer team2Id,
                           @RequestParam("choiceAfterToss") Integer choiceAfterToss){
//        System.out.println(team1Id+" "+team2Id);
        Team team1=teamService.getTeam(team1Id);
        Team team2=teamService.getTeam(team2Id);
        matchService.startMatching(team1,team2,choiceAfterToss);
    }

}
