package com.example.oop_logging_demo;



public class Main {
    public static void main(String[] args) {
        Game quiz = new QuizGame();
        quiz.start("Alice");
        quiz.play();
        quiz.end();

        Game puzzle = new PuzzleGame();
        puzzle.start("Bob");
        puzzle.play();
        puzzle.end();

        Game dodge = new DodgeGame();
        dodge.start("Charlie");
        dodge.play();
        dodge.end();
    }
}

