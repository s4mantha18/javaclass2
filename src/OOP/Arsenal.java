package OOP;

public class Arsenal extends Footballclub{
    public Arsenal(String coach, String captain, String stadium){
        super.setCoach(coach);
        super.setCaptain(captain);
        super.setStadium(stadium);
    }

    public static Footballclub configClub(){
        Footballclub club = new Arsenal("blah","jack", "doris");
        return club;
    }

    public static void main(String[] args) {
        System.out.println(configClub().toString());
    }
}


