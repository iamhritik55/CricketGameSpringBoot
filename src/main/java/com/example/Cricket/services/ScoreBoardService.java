package com.example.Cricket.services;

import com.example.Cricket.entity.ScoreBoard;
import com.example.Cricket.repo.ScoreBoardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreBoardService {
    @Autowired
    public ScoreBoardRepo scoreBoardRepo;
    public List<ScoreBoard> getScoreBoards() {
        return scoreBoardRepo.findAll();
    }
}
