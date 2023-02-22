package com.example.Cricket.entity;

import org.springframework.data.annotation.Id;

public class ScoreBoard {
    @Id
    private String scoreBoardId;
    private String matchId;
    private Team team1;
    private Team team2;
}
