/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nsanj
 */
class Shape {
    protected int width;
    protected int height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Rectangle extends Shape {
    public Rectangle(int width, int height) {
        super(width, height);
    }
}

class Square extends Shape {
    public Square(int side) {
        super(side, side);
    }
}

public class OOPExample {
    public static void main(String[] args) {
        Shape shape = new Shape(5, 10);
        System.out.println("Shape area: " + shape.getArea());

        Rectangle rect = new Rectangle(5, 10);
        System.out.println("Rectangle area: " + rect.getArea());

        Square square = new Square(5);
        System.out.println("Square area: " + square.getArea());
    }
}
