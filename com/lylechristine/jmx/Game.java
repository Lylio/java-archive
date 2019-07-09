package com.lylechristine.jmx;

public class Game implements GameMBean {

    private String playerName;

    @Override
    public void playFootball(String clubName) {
        System.out.println(this.playerName + " playing football for " + clubName);
    }

    @Override
    public String getPlayerName() {
        System.out.println("Return player name " + this.playerName);
        return playerName;
    }

    @Override
    public void setPlayerName(String playerName) {
        System.out.println("Set player name to value " + playerName);
        this.playerName = playerName;

    }
}

