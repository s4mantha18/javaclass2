package USINGLISTS;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner{

    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Samuel", "1234"));
        users.add(new User("Samantha", "1234"));
        users.add(new User("Darell", "1234"));


        System.out.println("Welcome, enter your name:");
        String name = new Scanner(System.in).nextLine();

        for (User user : users){
            if (!(user.getName().equals(name))){
                System.out.println("Not a member");
            }else {
                System.out.println("You are a member, Enter your password");
                String password = new Scanner(System.in).nextLine();
                if (user.getPassword().equals(password)){
                    System.out.println("Access granted");
                }else {
                    System.out.println("Access Denied");
                }
            }

        }


    }
}
