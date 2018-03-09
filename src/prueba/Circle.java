package prueba;

public class Circle implements Drawable, Comparable<Circle>, Cloneable {
    
    private double x, y, radius;
    
    public Circle (double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    public double getRadius () {
        return this.radius;
    }
    
    public double getX () {
        return this.x;
    }
    
    public double getY () {
        return this.y;
    }

    @Override
    public void draw (int color) {
        System.out.println ("Circle drawn in (" + this.x + ", " + this.y + ") with radius " + this.radius + " and color " + color);
    }
    
    public void destroy () {
        System.out.println ("Object Circle destroyed");

    }

    @Override
    public void fill(int color) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calculateArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Circle o) {
        double foo = calculateArea ();
        double bar = o.calculateArea ();
        
        if (foo == bar) 
            return 0;
        else
            return -1;
    }
    
    //Overrides method clone() from java.lang.Object
    @Override
    public Circle clone() throws CloneNotSupportedException
    {
        Circle cloned = (Circle)super.clone();
        return cloned;          
    }
}
