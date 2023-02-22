package com.example.Cricket.services;

import com.example.Cricket.entity.Player;
import com.example.Cricket.repo.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepo playerRepo;

    public Player addPlayer(Player player){
//        player.setPlayerId(UUID.randomUUID().toString().split("-")[0]);
        return playerRepo.save(player);
    }
    public List<Player> getPlayers() {
        return playerRepo.findAll();
    }
}
