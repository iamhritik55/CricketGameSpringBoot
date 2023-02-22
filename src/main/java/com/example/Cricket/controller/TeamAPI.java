package com.example.Cricket.controller;
import com.example.Cricket.entity.Team;
import com.example.Cricket.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/team")
public class TeamAPI {
    @Autowired
    private TeamService teamService;

    @PostMapping
    public Team addTeam(@RequestBody Team team){
        return teamService.addTeam(team);
    }
    @GetMapping
    public List<Team> getTeams(){
        return teamService.getTeams();
    }
}
