package com.capgemini;

import java.util.ArrayList;

public class GameController {

    String[] districtNames = {"Richard", "Isaac", "Walker", "Ken", "Olaf", "King", "Mr. Nice", "Arthur", "Chester",
                                "Ava", "Maggy", "Faith", "Carrie", "Queenie", "Rachel", "Monica", "Phoebe", "Madotsuki"};
    String[] careerNames = {"Chamberlain", "Old Knocker", "Paul de Leeuw", "Sorceress", "Potema the Wolf Queen", "Adelheid Roosen"};

    ArrayList<Contestant> players = new ArrayList<Contestant>();


    public void createPlayers(){
        for (int i = 0; i < 18 ; i++){
            DistrictContestant newDistrict = new DistrictContestant(districtNames[i]);
            players.add(newDistrict);
        }
    }

}
