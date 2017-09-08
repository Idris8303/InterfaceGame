package com.tiy;

public class Army implements Soldier {
    private Integer healthPoints;
    private String name;

    public Army(String name, Integer healthPoints) {
        this.healthPoints = healthPoints;
        this.name = name;
    }

    @Override
    public Integer getHealthPoints() {
        return healthPoints;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void hit(Integer damage){
        healthPoints -= damage;
    }
}

