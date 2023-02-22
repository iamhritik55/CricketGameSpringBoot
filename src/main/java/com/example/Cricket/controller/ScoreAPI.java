package com.example.Cricket.controller;

import com.example.Cricket.services.ScoreBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Cricket.entity.ScoreBoard;
import java.util.List;

@RestController
@RequestMapping("/score")
public class ScoreAPI {
    @Autowired
    public ScoreBoardService scoreBoardService;
    @GetMapping
    public List<ScoreBoard> getScoreBoards(){
        return scoreBoardService.getScoreBoards();
    }
}
