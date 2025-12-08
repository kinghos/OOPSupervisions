package SV2;

// Comparing the shape string to the desired type will

class Shape {
    String shape;

    // [James] Two problems. First you need to then *use* this....method added below
    // The other is that you are shadowing shape here....instead you should set shape in the constructor (see Circle for example)

    public String getType() {
        return shape;
    }
}

class Circle extends Shape {
    String shape = "circle";

    public Circle() {
        super.shape = "Circle";
    }
}

class Square extends Shape {
    String shape = "square";
}

class Oval extends Shape {
    String shape = "oval";
}

class Star extends Shape {
    String shape = "star";
}

