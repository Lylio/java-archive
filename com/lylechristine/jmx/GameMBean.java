package com.lylechristine.jmx;

public interface GameMBean {
    public void playFootball(String clubName);

    public String getPlayerName();

    public void setPlayerName(String playerName);
}
