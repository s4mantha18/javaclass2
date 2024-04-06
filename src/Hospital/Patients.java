package Hospital;

public class Patients {
    private String name;
    private String ailment;
    private String sex;
    private int age;

    private Doctors assigneddoctor;

    private Ward assignedward;

    public Patients(String name, String ailment, String sex, int age) {
        this.name = name;
        this.ailment = ailment;
        this.sex = sex;
        this.age = age;
    }

    public String getname(){
        return this.name;
    }
    public String getAilment(){
        return this.ailment;
    }
    public String getSex(){
        return this.sex;
    }
    public int getAge(){
        return this.age;
    }

    public void setAssignedDoc(Doctors assigneddoctor){
        this.assigneddoctor = assigneddoctor;
    }

    public Doctors getAssignedDoc(){
        return this.assigneddoctor;
    }

    public Ward getAssignedward() {
        return assignedward;
    }

    public void setAssignedward(Ward assignedward) {
        this.assignedward = assignedward;
    }
}
