package USINGLISTS;

import java.util.HashMap;
import java.util.Scanner;

public class Hash {
    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("Cat", "An Animal");
        dictionary.put("Promiscuous", "Someone that has many sexual partners");
        dictionary.put("Scot", "A person of scottish origin");
        dictionary.put("Sotto voce", "Saying something in a soft voice");
        dictionary.put("dais", "A raised platform in a hall");
        dictionary.put("apprehension", "a feeling of fear that something bad may happen");
        dictionary.put("Trendy", "very fashionable and modern");
        dictionary.put("cornucopia", "large number of different things");
        dictionary.put("hock", "A dry white wine from germany");
        dictionary.put("Tenement", "large old building which is divided into a number of individual flats");
        dictionary.put("gridlock", "situation that exists when all the roads in a particular place are full of vehicles");
        dictionary.put("Russian", "Something that belongs to russia");
        dictionary.put("beeswax", "wax made by bees");
        dictionary.put("Orient", "eastern part of asia");
        dictionary.put("loom", "something that appears a large unclear shape");
        dictionary.put("slur", "an insulting remark");
        dictionary.put("indie", "refers to music by new bands with small record companies");
        dictionary.put("Preen", "spending time to look attractive");
        dictionary.put("wafer", "A thin crisp biscuit eaten with icecream");
        dictionary.put("brown nosing", "agrreig wiwth someone to get thier support");

        System.out.println("Welcome, Do you want \n1) The List of words \n2) The words and get its meanings");
        String option = new Scanner(System.in).nextLine();
        if (option.equals("1")){
            int count = 1;
            for(String word: dictionary.keySet()){
                System.out.println(count + " "  + word);
                count++;
            }
        } else if (option.equals("2")) {
            System.out.println("Enter your word");
            String Meaning = new Scanner(System.in).nextLine();
            System.out.println(dictionary.get(Meaning));
        } else {
            System.out.println("INCORRECT INPUT");
        }
    }

}
