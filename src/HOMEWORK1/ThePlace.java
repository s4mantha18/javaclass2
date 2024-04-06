package HOMEWORK1;

import java.util.Arrays;

public class ThePlace implements Restaurant{

    private String location;
    private String[] menulist;

    public ThePlace(String location, String[] menulist) {
        this.location = location;
        this.menulist = menulist;
    }


    public void location() {
        System.out.println("The location is : " + location);
    }

    public String[] menulist() {
        System.out.println("The menu : " + Arrays.toString(menulist));
        return new String[3];
    }
}
