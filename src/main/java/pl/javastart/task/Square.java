package pl.javastart.task;

public class Square {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double calculateArea() {
        return Math.pow(side, 2);
    }
}
