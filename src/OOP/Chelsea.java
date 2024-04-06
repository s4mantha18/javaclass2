package OOP;

public class Chelsea extends Footballclub{
    public Chelsea(String coach, String captain, String stadium){
        super.setCoach(coach);
        super.setCaptain(captain);
        super.setStadium(stadium);
    }

    public static Footballclub Clubconfig(){
        Footballclub club = new Chelsea("blah","jack", "doris");
        return club;
    }

    public static void main(String[] args) {
        System.out.println(Clubconfig().toString());
    }
}
