package com.capgemini;

import java.util.Random;

public class Contestant {

    int health;
    int attack;
    int defense;
    String name;
    Random rand;

    int getRandomNumber(){
        rand = new Random();
        int num = rand.nextInt(2);
        return num;
    }

    void pickAction(int action){

        switch (action){
            case 0:
                rest();
                break;
            case 1:
                sharpen();
                break;
            default:
                break;
        }
    }

    //Action that allows contestants to heal.
    void rest(){
        System.out.println(name + " takes a nap and restores 20 HP.");
        health += 20;
    }

    // Action that raises attack.
    void sharpen(){
        System.out.println(name + " sharpens his weapon and gains a +1 attack bonus.");
        attack += 1;
    }

    //Action that does nothing.
    void hide(){
        System.out.println(name + " hides until potential threats are gone.");
    }

    void inflictDamage(Contestant victim){
        int damage = calculateDamage(victim);
        System.out.println(name + " slashes at " + victim.name + " and inflicts " + damage + " damage.");
        victim.health -= damage;
    }

    int calculateDamage(Contestant victim){
        int damageDealt = (attack * 10) - (victim.defense * 2);
        return damageDealt;
    }

}
