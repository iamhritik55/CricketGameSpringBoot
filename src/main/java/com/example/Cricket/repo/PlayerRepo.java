package com.example.Cricket.repo;

import com.example.Cricket.entity.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayerRepo extends MongoRepository<Player,String> {

}
