package SV3;

import java.util.ArrayList;
import java.util.List;

// [James] This class should be called CompositeShape. As it stands, it cannot be used outside of this package
class ShapeGroup extends Shape {
    List<Shape> shapes;
    public void add(Shape shape) {
        shapes.add(shape);
    }
    public void remove(Shape shape) {
        shapes.remove(shape);
    }

    @Override
    public void draw() {
        for (Shape shape: shapes) {
            shape.draw();
        }
    }
}

// [James] The question really want a main method here to deal with multiple shapes
// (including non-ShapeGroups)
public class CompositeShapes {
}
