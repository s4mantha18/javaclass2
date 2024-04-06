package HOMEWORK2;

public class Player {
    private String firstname;
    private String lastname;
    private int age;
    private int jerseyNumber;

    @Override
    public String toString() {
        return "Player{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", jerseyNumber=" + jerseyNumber +
                '}';
    }

    public Player(String firstname, String lastname, int age, int jerseyNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.jerseyNumber = jerseyNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }
}
