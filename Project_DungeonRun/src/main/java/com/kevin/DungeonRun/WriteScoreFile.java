package com.kevin.DungeonRun;

import java.io.FileWriter;

public class WriteScoreFile {

    Player player = new Player();

    public void writeScoreFile() {

        try {
            FileWriter playerFileWriter = new FileWriter("Player_Results.txt");  // Default means file gets created in the project folder

            playerFileWriter.write(player.getPlayerName() +
                            "\nLevel reached: " + player.getLevel() +
                            "\nWeapon used: " + player.getCurrentWeapon() +
                            "\nMonsters defeated: " + player.getMonstersKilled()
                    );
            playerFileWriter.close();
            System.out.println("To see final score stats, check the text-file named 'Player_Results.txt'");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("It doesn't work");
        }

    }

}
