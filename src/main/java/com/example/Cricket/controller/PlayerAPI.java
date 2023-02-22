package com.example.Cricket.controller;

//import com.example.Cricket.entity.Test;
import com.example.Cricket.entity.Player;
import com.example.Cricket.services.PlayerService;
//import com.example.Cricket.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerAPI {

//    @Autowired
//    private TestService testService;
    @Autowired
    private PlayerService playerService;
    @PostMapping
    public Player addPlayer(@RequestBody Player player){
        return playerService.addPlayer(player);
    }
    @GetMapping
    public List<com.example.Cricket.entity.Player> getPlayers(){
        return playerService.getPlayers();
    }


}
