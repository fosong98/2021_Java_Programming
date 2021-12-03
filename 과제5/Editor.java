package edu.pnu.edit;
import edu.pnu.shape.*;
import java.util.List;
import java.util.ArrayList;

public class Editor {
    private List<Shape> shapes = new ArrayList<>();
    public void add(Shape shape) {
        shapes.add(shape);
    }
    public void clear() {
        shapes.clear();
    }
    public void list() {
        System.out.print("[");
        for (int i = 0; i < shapes.size();)
        {
            Shape elem = shapes.get(i);
            if (elem instanceof Rectangle) {
                Rectangle r = (Rectangle) elem;
                System.out.print(r.toString());
            }
            else if (elem instanceof Circle) {
                Circle c = (Circle) elem;
                System.out.print(c.toString());
            }
            ++i;
            if (i < shapes.size())
                System.out.print(", ");
        }
        System.out.println("]");
    }
}
