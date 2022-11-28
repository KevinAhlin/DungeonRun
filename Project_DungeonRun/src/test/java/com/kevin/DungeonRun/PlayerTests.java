package com.kevin.DungeonRun;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTests {

    Player player;

    @BeforeEach
    void setup() {
        player = new Player();
    }

    @Test
    @DisplayName("Checking to see if the right amount of damage from player is returned")
    public void calculateDamageTest() {

        assertTrue(
                player.getMinDamage() <= player.calculateDamage() &&
                        player.getMaxDamage() >= player.calculateDamage());
    }

    @Test
    @DisplayName("Checking if players level increases when maxExperience is reached")
    public void checkIfLeveledUpTest() {
        player.setExperience(player.getMaxExperience());        // Sets to max experience to level up
        player.checkIfLevelUp();

        assertEquals(2, player.getLevel());
    }

    @Test
    @DisplayName("Checking to see if the player can lose the game by dying")
    public void isAliveTest() {
        player.setHealth(0);

        assertFalse(player.isAlive());
    }

    @RepeatedTest(5)
    @DisplayName("Adding X amount of experience to check if the random amount of exp is added to players experience")
    public void experienceAmountXTest() {
        Random random = new Random();
        player.setExperience(19);

        int x = random.nextInt(1,10);
        System.out.println(x);
        player.setExperience(player.getExperience() + x);
        player.checkIfLevelUp();

    }

}