package SV3;

import java.util.List;

class Shape {
    public void draw() {}
}

public class ScreenRefresh {
    List<Shape> shapes;

    public void callScreenRefresh() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    public static void drawBorders() {}
}
