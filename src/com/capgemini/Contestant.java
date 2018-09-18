package com.capgemini;

public class Contestant {

    int health;
    int attack;
    int defense;
    String name;

    void rest(){
        System.out.println(name + " takes a nap and restores 20 HP");
        health += 20;
    }

    void sharpen(){
        System.out.println(name + " sharpens his weapon and gains a +1 attack bonus");
        attack += 1;
    }

}
