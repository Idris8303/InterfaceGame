package com.tiy;

public class Main {

    public static void main(String[] args) {

        Soldier childs = new Marines("Marine Officer Childs", 100);
        Soldier meton = new Army("Army Grunt Melton", 100);

        Game game = new Game(childs, meton);
        game.play();    }
}
