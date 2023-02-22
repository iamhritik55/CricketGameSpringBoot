package com.example.Cricket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Document(collection = "ScoreBoard")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class ScoreBoard {
    @Id
    private String scoreBoardId;
    private String matchId;
    private Team winningTeam;
    private Team lossingTeam;
}
