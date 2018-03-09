package prueba;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    
    public static void main(String[] args) {
        /*Drawable [] shapes = new Drawable [] {
            new Circle (10, 20, 30),
            new Rectangle (5, 8, 8, 9),
            new Circle (30, 20, 10),  
        };
        
        for (int i = 0; i < shapes.length; i++) {
            shapes [i].draw (Drawable.RED);
        }*/
        
        Shapes shapes = new Shapes ();
        shapes.add (new Circle (10, 20, 30));
        shapes.add (new Rectangle (5, 8, 8, 9));
        shapes.add (new Circle (30, 20, 10));
        
        for (Drawable item: shapes) {
            item.draw (0);
        }
        System.out.println("\n");
        
        //Create new Circle and a copy of it
        Circle original = new Circle (5, 10, 15);
        try
        {
            Circle copy = original.clone();
            //Draw the original and the copied circle
            original.draw(3);
            copy.draw(3);
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println(" Unable to clone.");
        }
    }
}

class Shapes implements Iterable<Drawable> {
    ArrayList<Drawable> store = new ArrayList<> ();
    
    void add (Drawable d) {
        store.add (d);
    }

    @Override
    public Iterator iterator() {
        return store.iterator ();
    }
}