package prueba;

public class Rectangle implements Drawable {
    private double x1, y1, x2, y2;
    
    public Rectangle (double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public double getX1 () {
        return this.x1;
    }
    
    public double getY1 () {
        return this.y1;
    }
    
    public double getX2 () {
        return this.x2;
    }
    
    public double getY2 () {
        return this.y2;
    }

    @Override
    public void draw(int color) {
        String foo = String.format ("Rectangle drawn with upper-left corner at (%.2f, %.2f) and lower-right corner at (%.2f, %.2f) and color %d",
                this.x1, this.y1, this.x2, this.y2, color);
        
        System.out.println (foo);
    }

    @Override
    public void fill(int color) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calculateArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
