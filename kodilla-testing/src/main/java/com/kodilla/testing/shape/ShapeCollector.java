package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (figures.contains(shape)) {
            figures.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape figure = null;
        if (n >= 0 && n < figures.size()) {
            figure = figures.get(n);
        }
        return figure;
    }

    public void showFigures() {
        for (Shape figure : figures)
            System.out.println("Name: " + figure.getShapeName() + " and area: " + figure.getField());
    }
}
