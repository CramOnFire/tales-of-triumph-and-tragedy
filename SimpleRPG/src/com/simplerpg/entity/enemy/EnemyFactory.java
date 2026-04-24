package com.simplerpg.entity.enemy;
import java.util.Random;

// To do: Add more enemy types using random floats to determine which enemy to spawn. Weaker enemies should be more common.
public class EnemyFactory {
    private Random random = new Random();

    public Enemy createEnemy(String areaName) {
        switch (areaName.toLowerCase()) {
            case "forest":
                int roll = random.nextInt(3);
                if (roll == 0) return new Slime();
                if (roll == 1) return new Snake();
                return new Sorcerer();

            case "mountain":
                return new Dragon();

            default:
                return new Slime();
        }
    }
}