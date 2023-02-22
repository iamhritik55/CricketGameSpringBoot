package com.example.Cricket.entity;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Player")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Player {
    @Id
    private int playerId;
    private String name;
//    private String teamId;
    private int battingScore,bowlingWickets, totalBallsDelivered;
    //    HashMap<Integer, Integer> scores = new HashMap<Integer, Integer>(); //stores score of each match
    private int total4s, total6s, totalMatchesPlayed;

}

