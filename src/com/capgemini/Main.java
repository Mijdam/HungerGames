package com.capgemini;

public class Main {

    public static void main(String[] args) {
	    CareerContestant richard = new CareerContestant("Richard");
	    DistrictContestant maggy = new DistrictContestant("Maggy");

	    System.out.println(richard.name + " has an attack stat of " + richard.attack);
	    richard.inflictDamage(maggy);
        System.out.println(maggy.health);
    }
}
