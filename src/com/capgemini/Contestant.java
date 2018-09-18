package com.capgemini;

public class Contestant {

    int health;
    int attack;
    int defense;
    boolean male;
    String name;
    Contestant enemy1;

    void pickAction(int action){

        switch (action){
            case 0:
                rest();
                break;
            case 1:
                sharpen();
                break;
            case 2:
                hide();
                break;
            case 3:
                kamikaze(enemy1);
                break;
            case 4:
                inflictDamage(enemy1);
                break;
            default:
                break;
        }
    }

    //Action that allows contestants to heal.
    void rest(){
        System.out.println(name + " takes a nap and restores 20 HP.\n");
        health += 20;
    }

    // Action that raises attack.
    void sharpen(){
        System.out.println(name + " sharpens his weapon and gains a +1 attack bonus.\n");
        attack += 1;
    }

    //Action that does nothing.
    void hide(){
        System.out.println(name + " hides until potential threats are gone.\n");
    }

    void kamikaze (Contestant victim){
        System.out.println(name + " drags " + victim.name + " towards a ravine, killing them both.");
        health -= 999;
        victim.health -= 999;
    }

    void inflictDamage(Contestant victim){
        int damage = calculateDamage(victim);
        System.out.println(name + " slashes at " + victim.name + " and inflicts " + damage + " damage.\n");
        victim.health -= damage;
    }

    int calculateDamage(Contestant victim){
        int damageDealt = (attack * 10) - (victim.defense * 2);
        return damageDealt;
    }

}
