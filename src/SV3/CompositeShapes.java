package SV3;

import java.util.List;

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

public class CompositeShapes {
}
