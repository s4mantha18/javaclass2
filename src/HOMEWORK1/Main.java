package HOMEWORK1;

public class Main {
    public static void main(String[] args) {
        String[] megachickenmenulist =  new String[3];
        megachickenmenulist[0] = "Rice";
        megachickenmenulist[1] = "Chicken";
        megachickenmenulist[2] = "Pizza";

        String[] theplacemenulist =  new String[3];
        theplacemenulist[0] = "Spaghetti Bologna";
        theplacemenulist[1] = "Alfredo";
        theplacemenulist[2] = "Pizza";

        String[] blackbellmenulist =  new String[3];
        blackbellmenulist[0] = "Spaghetti Bologna";
        blackbellmenulist[1] = "Alfredo";
        blackbellmenulist[2] = "Pizza";

        MegaChicken megaChicken = new MegaChicken("Ikota Lagos", megachickenmenulist);
        BlackBell blackBell = new BlackBell("Ikota Lagos", blackbellmenulist);
        ThePlace theplace = new ThePlace("Ikota Lagos", theplacemenulist);

        megaChicken.location();
        megaChicken.menulist();
        blackBell.location();
        blackBell.menulist();
        theplace.location();
        theplace.menulist();



    }
}
