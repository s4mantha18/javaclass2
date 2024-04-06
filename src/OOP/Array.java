package OOP;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] names = {"Ayo", "Micheal", "Timothy"};
        String[] names2 = new String[3];
        names2[0] = "Mike";
        Arrays.sort(names); //arranges alphabetically
        System.out.println(names[1]);
        for (int i = 0; i<names.length; i++){
            System.out.println(names[i]);
        }
    }
}
