package HOMEWORK2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class CHIEFS implements FootBallClub{
    @Override
    public ArrayList<Player> playerList() {
        ArrayList<Player> chiefsplayers = new ArrayList<>();
        chiefsplayers.add(new Player("Thiago", "Silva", 28, 10));
        chiefsplayers.add(new Player("Messi", "Leo", 28, 10));
        return chiefsplayers;
    }



//    private String showcoachaname;
//    private String stadiumlocation;
//    private String[] playerlist;
//
//    public CHIEFS(String showcoachaname, String stadiumlocation, String[] playerlist) {
//        this.showcoachaname = showcoachaname;
//        this.stadiumlocation = stadiumlocation;
//        this.playerlist = playerlist;
//    }
//
//
//
//    public void showcoachname() {
//        System.out.println("The name of the coach is " + showcoachaname);
//    }
//
//
//    public void stadiumlocation() {
//        System.out.println("The stadium is located at " + stadiumlocation);
//    }
//
//    public String[] playerlist() {
//        System.out.println("The players are " + playerlist);
//        return playerlist;
    }

