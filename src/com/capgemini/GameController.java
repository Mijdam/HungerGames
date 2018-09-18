package com.capgemini;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GameController {

    int currentDay = 1;
    String[] districtNames = {"Richard", "Isaac", "Walker", "Ken", "Olaf", "King", "Mr. Nice", "Arthur", "Chester",
                                "Ava", "Maggy", "Faith", "Carrie", "Queenie", "Rachel", "Monica", "Phoebe", "Madotsuki"};
    String[] careerNames = {"Chamberlain", "Old Knocker", "Paul de Leeuw", "Sorceress", "Potema the Wolf Queen", "Adelheid Roosen"};

    ArrayList<Contestant> players = new ArrayList<Contestant>();
    Random rand;


    public void createPlayers(){
        boolean isMale = true;
        for (int i = 0; i < 18; i++){
            if (i > 9) { isMale = false; }
            DistrictContestant newDistrict = new DistrictContestant(districtNames[i]);
            players.add(newDistrict);
        }

        isMale = true;

        for (int i = 0; i < 6; i++){
            if (i > 3) { isMale = false; }
            CareerContestant newDistrict = new CareerContestant(careerNames[i]);
            players.add(newDistrict);
        }

        Collections.shuffle(players); // List is shuffled to make things less predictable.
    }

    public void playDay(){
        System.out.println("Day " + currentDay + "\nLet the games begin!\n");

        for (int i = 0; i < players.size(); i++){
            players.get(i).enemy1 = players.get(getRandomNumber(players.size()));
            players.get(i).pickAction(getRandomNumber(5));
            checkAllPlayersHealth();
        }

        currentDay++;
    }

    //This method is temporary. It's called after every turn. In the future, it should only affect players who did
    //something in that turn, not all players.
    public void checkAllPlayersHealth(){
        for (int i = 0; i < players.size(); i++){
            if (players.get(i).health <= 0){
                System.out.println(players.get(i).name + " was defeated.");
                players.remove(i);
            }
        }
    }

    int getRandomNumber(int boundary){
        rand = new Random();
        int num = rand.nextInt(boundary);
        return num;
    }

}
