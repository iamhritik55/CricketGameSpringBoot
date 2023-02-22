package com.example.Cricket.entity;

import org.springframework.data.annotation.Id;

public class Match {
    @Id
    private String matchId;
    private String winnerTeam;
    private String loserTeam;
    private String venue;
}
