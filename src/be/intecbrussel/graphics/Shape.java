package be.intecbrussel.graphics;

public abstract class Shape{

    private static int count; // in UML underlined indicates static. Static
    // means, it can be used / called without creating an object
    private int x;
    private int y;

    // initialisation block
    {
        count++; // to count 1 up each time a 'shape' object is created
        // (which will only be the case when we create objects of the
        // subclasses of Shape
    }

    // constructor method without parameters
    public Shape() { // here we allow to call a 'shape' without any value
        // provided
        this(1, 1); // here we provide 2 default values to allow moving to the
        // constructor with 2 parameters
    }

    // constructor method with 2 parameters
    public Shape(int x, int y) {
        this.x = x; // we refer back to the private int x declared
        this.y = y; // we refer back to the private int y declared
    }

    // setter method for setting the value of x
    public void setX(int x) {
        this.x = x;
//        setX(x);
    }

    // setter method for the value of y (because we SET, we are not returning
    // anything; this is why we use 'void'.
    public void setY(int y) {
        this.y = y;
//        setY(y);
    }

    // getter method for the value of x (we need to RETURN a value)
    public int getX() {
        return x;
    }

    // getter method for the value of x (we need to RETURN a value)
    public int getY() {
        return y;
    }

    // setter method for the x and y values of the position (NO RETURN! Void!)
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
//        setX(x);
//        setY(y);
    }

    // getter method for Area - but as we do not will an instance / object of
    // our Shape class (it is an abstract class) we are only placing this
    // method in this class so that it can be inherited by the subclasses
    // we're going to create.
    public double getArea() {
        double area = 0;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 0;
        return perimeter;
    }

    public static int getCount() { // we declare this method static so it can
        // be used without object being created (as Shape is abstract, we'll
        // never create an object of Shape, but we want to count whenever a
        // subclass of Shape is created.
        return count;
    }

    protected abstract int Circle(int c);// this return type belong to ShapeApp// we will do this together on sunday around 1pm
}