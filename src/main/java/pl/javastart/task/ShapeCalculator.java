package pl.javastart.task;

public class ShapeCalculator {

    public double calculateSquareArea(Square square) {
        return Math.pow(square.getSide(), 2);
    }

    public double calculateCircleArea(Circle circle) {
        return Math.pow(circle.getRadius(), 2) * Circle.PI;
    }

    public double calculateTrianglePerimeter(Triangle triangle) {
        return triangle.getSideA() + triangle.getSideB()
                + triangle.getSideC();
    }

    public double calculateRectPerimeter(Rectangle rectangle) {
        return 2 * (rectangle.getSideA() + rectangle.getSideB());
    }
}
