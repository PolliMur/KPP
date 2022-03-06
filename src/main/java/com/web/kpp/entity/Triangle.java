package com.web.kpp.entity;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    public boolean isEquilateral = false;
    public boolean isIsosceles = false;
    public boolean isRectangular = false;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void identifyTriangle() {
        this.isEquilateral = this.side1 == this.side2 && this.side2 == this.side3;

        this.isIsosceles = this.side1 == this.side2 || this.side2 == this.side3 || this.side1 == this.side3;

        this.isRectangular = (
                Math.pow(this.side1, 2) == Math.pow(this.side2, 2) + Math.pow(this.side3, 2) ||
                        Math.pow(this.side2, 2) == Math.pow(this.side1, 2) + Math.pow(this.side3, 2) ||
                        Math.pow(this.side3, 2) == Math.pow(this.side1, 2) + Math.pow(this.side2, 2)
        );

    }
}
