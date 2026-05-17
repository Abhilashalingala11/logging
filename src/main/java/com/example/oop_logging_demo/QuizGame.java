package com.example.oop_logging_demo;




public class QuizGame extends Game {
    private int score = 0;

    @Override
    public void play() {
        logger.debug("🧩 Question displayed: What is 2+2?");
        score++;
        logger.info("✅ Correct answer! Score is now {}", score);
    }
}

