package com.example.Cricket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Match")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Match {
    @Id
    private String matchId;
    private String winnerTeam;
    private String loserTeam;
    private String venue;
}
