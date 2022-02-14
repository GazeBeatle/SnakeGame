package controller;

import model.GameFrame;

public class SnakeGame {

    public static void main(String[] args) {
        System.setProperty("sun.java2d.opengl", "true");

        new GameFrame();
    }
}
