package com.example.Cricket.repo;

import com.example.Cricket.entity.Team;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeamRepo extends MongoRepository<Team,Integer> {

}
