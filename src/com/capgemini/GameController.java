package com.capgemini;

import java.util.ArrayList;
import java.util.Collections;

public class GameController {

    int currentDay = 1;
    String[] districtNames = {"Richard", "Isaac", "Walker", "Ken", "Olaf", "King", "Mr. Nice", "Arthur", "Chester",
                                "Ava", "Maggy", "Faith", "Carrie", "Queenie", "Rachel", "Monica", "Phoebe", "Madotsuki"};
    String[] careerNames = {"Chamberlain", "Old Knocker", "Paul de Leeuw", "Sorceress", "Potema the Wolf Queen", "Adelheid Roosen"};

    ArrayList<Contestant> players = new ArrayList<Contestant>();


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
        System.out.println("Day " + currentDay);
    }

    public void killPlayer(Contestant player){
        players.remove(player);
    }

}
