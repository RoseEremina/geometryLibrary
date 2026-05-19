package com.eremin.geometry.shapes;

public class Triangle implements Shape {
    private double sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0)
            throw new IllegalArgumentException("Sides must be positive");
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA)
            throw new IllegalArgumentException("Invalid triangle sides");
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String getType() {
        return "Triangle";
    }
}
