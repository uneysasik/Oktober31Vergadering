package be.intecbrussel.graphics;

public abstract class Circle extends Shape {

    public static int Angles = 0;
    private static int count;
    private int Circle;
    private int radius;
    private int x;
    private int y;

    // this is a constructor without parameters//
    public Circle(){

    }
    // this is  a constructor with one parameter
    public int Circle(int radius) {
        return radius;
    }
    // this is a constructor with two parameters
    public Circle(int radius, int x, int y) {
        this.radius = 0;
        this.x = x;
        this.y = y;
    }

    public Circle(int Circle) {
        int c= Circle;
        this.Circle(c);
    }
    //this is our get methode for Radius//
    public int getRadius() {
        return radius;
    }
    /// this is our set methode for radius//
    public int setRadius(int radius){
        return radius;
    }
    // this is our get area methode--> and return type
    public double getArea(){
        return getArea();
    }
    public double getPerimeter(){
        return getPerimeter();
    }
    public int grow( int d){
        return grow(d);
    }
    // we make this a static methode because that is what Manueel expected for us. see in the book for more details//
    public static int getCount(){
        return getCount();
    }
}