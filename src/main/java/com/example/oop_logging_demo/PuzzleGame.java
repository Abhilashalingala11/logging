package com.example.oop_logging_demo;



public class PuzzleGame extends Game {
    @Override
    public void play() {
        logger.debug("🧠 Puzzle presented: Solve the maze");
        logger.warn("⚡ Player took too long... adding hint!");
        logger.info("🎉 Puzzle solved successfully!");
    }
}
