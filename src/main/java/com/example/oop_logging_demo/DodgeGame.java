package com.example.oop_logging_demo;



public class DodgeGame extends Game {
    @Override
    public void play() {
        logger.debug("🏃 Dodge challenge started");
        logger.warn("⚡ Button dodged! Player laughed 😂");
        logger.error("❌ Player missed the dodge!");
    }
}
