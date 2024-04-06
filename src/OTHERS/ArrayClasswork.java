package OTHERS;

import java.util.Scanner;

public class ArrayClasswork {
    public static void main(String[] args) {
        System.out.println("Enter a Firstname");
        String Firstname = new Scanner(System.in).nextLine();
        System.out.println("Enter a Middlename");
        String Middlename = new Scanner(System.in).nextLine();
        System.out.println("Enter a Lastname");
        String Lastname = new Scanner(System.in).nextLine();

        String[] Fullname = new String[3];
        Fullname[0] = Firstname;
        Fullname[1] = Middlename;
        Fullname[2] = Lastname;

        for (int i = 0; i < Fullname.length; i++) {
            System.out.println(Fullname[i]);
        }
    }
}

