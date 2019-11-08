package com.company;

import java.util.Random;

public class Boss {
    int health;
    int damage;
    int protectType;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getProtectType() {
        return protectType;
    }

    public void setProtectType(int protectType) {
        this.protectType = protectType;
    }
    public void changeProtectType(){
        Random r = new Random();
        int randomNumber = r.nextInt(100) +1;
        protectType = randomNumber;
    }

}
