package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(25.0);
        Rectangle rectangle = new Rectangle(10000.0, 3.5);
        Square square = new Square(343.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        ShapeCalculator shapeCalculator = new ShapeCalculator();

        System.out.println("Pole kwadratu: " + shapeCalculator.calculateSquareArea(square));
        System.out.println("Pole koła: " + shapeCalculator.calculateCircleArea(circle));
        System.out.println("Obwód trójkąta: "
                + shapeCalculator.calculateTrianglePerimeter(triangle));
        System.out.println("Obwód prostokąta: "
                + shapeCalculator.calculateRectPerimeter(rectangle));
    }
}
