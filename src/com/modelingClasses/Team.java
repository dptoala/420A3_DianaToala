package com.modelingClasses;

import java.util.ArrayList;
import java.util.List;

public class Team {
    //Attributes
    String teamName;
    private List<Player> players;

    //Constructor
    public Team(String teamName){
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    //Methods Get and Set
    public String GetTeamName(){
        return this.teamName;
    }
    public void SetTeamName(String teamName){
        this.teamName = teamName;
    }
}
