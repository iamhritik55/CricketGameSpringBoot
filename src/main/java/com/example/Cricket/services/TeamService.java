package com.example.Cricket.services;
import com.example.Cricket.entity.Team;
import com.example.Cricket.controller.TeamAPI;
import com.example.Cricket.repo.TeamRepo;
import jakarta.annotation.ManagedBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    @Autowired
    private TeamRepo teamRepo;

    public Team addTeam(Team team){
        return teamRepo.save(team);
    }
    public List<Team> getTeams(){
        return teamRepo.findAll();
    }
    public Team getTeam(int teamId){
        return teamRepo.findById(teamId).get();
    }
}
