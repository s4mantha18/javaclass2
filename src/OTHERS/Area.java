package OTHERS;

public class Area {
    public Area(int l){
        System.out.println("OTHERS.Area of a square");
        System.out.println(l*l);
    }
    public Area(int l, int b){
        System.out.println("OTHERS.Area of a rectangle");
        System.out.println(l*b);
    }
    public Area(double b, int h){
        System.out.println("OTHERS.Area of triangle");
        System.out.println((0.5)*b*h);
    }

    public Area(double r){
        System.out.println("OTHERS.Area of a cirle");
        System.out.println((22/7)*r*r);
    }
}
