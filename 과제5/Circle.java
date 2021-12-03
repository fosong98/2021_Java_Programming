package edu.pnu.shape;

public class Circle extends Shape {
    private Point center;
    private int radius;
    public Circle(Point point, int radius)
    {
        center = point;
        this.radius = radius;
    }
    @Override
    public float getArea() {
        return (float) (radius * radius) * (float) Math.PI;
    }
    @Override
    public String toString()
    {
        return String.format("[Circle %s, radius: %d area: %.2f]", center.toString(), radius, getArea());
    }
}
