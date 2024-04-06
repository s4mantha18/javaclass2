package OOP;

public class Footballclub {
    private String Coach;
    private String Captain;
    private String Stadium;

    public String getCoach() {
        return Coach;
    }

    public void setCoach(String coach) {
        this.Coach = coach;
    }

    public String getCaptain() {
        return Captain;
    }

    public void setCaptain(String captain) {
        this.Captain = captain;
    }

    public String getStadium() {
        return Stadium;
    }

    public void setStadium(String stadium) {
        this.Stadium = stadium;
    }

    @Override
    public String toString(){
        return "Footballclub{coach=' " + Coach + '\'' + ", Captain=' " + Captain +'\'' + ", stadium=' " + Stadium +'\'' +
                '}';
    }
}
