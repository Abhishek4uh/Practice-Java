package com.abhishek.practicejava.java.hashmap;

import java.util.Objects;

public class Player{
    String playerId;
    private int hashCode;

    Player(String id){
        this.playerId= id;
        this.hashCode= Objects.hashCode(id);
    }

    @Override
    public int hashCode(){
        return hashCode;
    }

    @Override
    public String toString() {
        return playerId;
    }



    @Override
    public boolean equals(Object obj){
        Player p1= (Player) obj;
        return p1.playerId == this.playerId;
    }
}

class Rank{
    int rank;
    private int hashCode;

    Rank(int rank){
        this.rank= rank;
        this.hashCode= Objects.hashCode(rank);
    }

    @Override
    public String toString(){
        return ""+this.rank;
    }

    @Override
    public int hashCode(){
        return hashCode;
    }

    @Override
    public boolean equals(Object obj){
        Rank r1= (Rank) obj;
        return r1.rank == this.rank ;
    }
}
