package com.kodilla.testing.shape;

public class Square implements Shape{
    double sideSize;

    public Square(double sideSize) {
        this.sideSize = sideSize;
    }

    @Override
    public String getShapeName() {
        return "square";
    }

    @Override
    public double getField() {
        return sideSize*sideSize;
    }

    public double getSideSize() {
        return sideSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return Double.compare(square.sideSize, sideSize) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(sideSize);
        return (int) (temp ^ (temp >>> 32));
    }
}
