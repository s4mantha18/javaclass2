package HOMEWORK2;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        FootBallClub chiefs = new CHIEFS();
        System.out.println(chiefs.playerList());

        LinkedList<Integer> listofevennumbers = new LinkedList<Integer>();
        listofevennumbers.add(2);
        listofevennumbers.add(4);
        listofevennumbers.add(6);
        listofevennumbers.add(8);
        listofevennumbers.add(10);
        System.out.println(listofevennumbers);

//        String[] chiefsplayerlist =  new String[3];
//        chiefsplayerlist[0] = "Travis Kelce";
//        chiefsplayerlist[1] = "Patrick Mahomes";
//        chiefsplayerlist[2] = "Trent McDuffie";
//
//        String[] cowboysplayerlist =  new String[3];
//        cowboysplayerlist[0] = "Tony pollard";
//        cowboysplayerlist[1] = "Dak Prescott";
//        cowboysplayerlist[2] = "Asim Richards";
//
//        String[] packersplayerlist =  new String[3];
//        packersplayerlist[0] = "Jon Runyan";
//        packersplayerlist[1] = "Benny Sapp";
//        packersplayerlist[2] = "Darnell savage";
//
//        CHIEFS chiefs = new CHIEFS("Andy Reid", "Allegiant Stadium", chiefsplayerlist);
//        COWBOYS cowboys =  new COWBOYS("Mike McCarthy", "Allegiant Stadium", cowboysplayerlist);
//        PACKERS packers = new PACKERS("Matt LaFleur", "Allegiant Stadium", packersplayerlist);
//
//        chiefs.showcoachname();
//        chiefs.stadiumlocation();
//        chiefs.playerlist();
//
//        cowboys.showcoachname();
//        cowboys.stadiumlocation();
//        cowboys.playerlist();
//
//        packers.showcoachname();
//        packers.stadiumlocation();
//        packers.playerlist();

    }
}
