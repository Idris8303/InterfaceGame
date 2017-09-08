package com.tiy;

public interface Soldier {

    Integer getHealthPoints();

    String getName();

    //Hit amount of damage
    void hit(Integer damage);
}
