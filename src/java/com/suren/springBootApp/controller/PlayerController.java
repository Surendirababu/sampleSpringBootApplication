package com.suren.springBootApp.controller;

import com.suren.springBootApp.model.Player;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SYSTEM on 4/22/2017.
 */

@CrossOrigin
@RestController

public class PlayerController {

    //URL- "http://localhost:8080/palyers/details/json"
    @RequestMapping(value = "/palyers/details/json",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Player> getPlayersListInJson()
    {
        List players = new ArrayList();

        Player p1= new Player(1,"Murali Vijay");
        Player p2= new Player(2,"Dhoni");

        players.add(p1);
        players.add(p2);
        return  players;

    }
}

