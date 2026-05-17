package com.example.oop_logging_demo;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Game {
    protected final Logger logger = LogManager.getLogger(getClass());
    protected String player;

    public void start(String player) {
        this.player = player;
        logger.info("Game started for player: {}", player);
    }

    public abstract void play();

    public void end() {
        logger.info("🏁 Game ended for player: {}", player);
    }
}

