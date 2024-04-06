package Hospital;

public class Dog {
        public Dog(){
    }

    public Dog(String name){
        System.out.println(name);
    }

    public Dog(String name, String breed){
        System.out.println(name + ", " + breed);
    }

    public Dog(String name, String breed, int age){
        System.out.println(name + ", " + breed + ", " +age);
    }
}
