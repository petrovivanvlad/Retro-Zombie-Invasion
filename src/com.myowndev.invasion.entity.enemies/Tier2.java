package com.myowndev.invasion.entity.enemies;

import com.myowndev.invasion.entity.Enemy;

/**
 * Created by Iwan on 22.09.2015.
 */
public class Tier2 extends Enemy {
    public Tier2(int start_x, int start_y) {
        super(start_x, start_y);
        speed = 2;
        scoreGain = 1;
        scoreLoss = 2;
        hp = 2;
        silverGain = 1;
    }
}

















































