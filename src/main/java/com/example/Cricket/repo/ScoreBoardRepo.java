package com.example.Cricket.repo;

import com.example.Cricket.entity.ScoreBoard;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ScoreBoardRepo extends MongoRepository<ScoreBoard,String> {

}
