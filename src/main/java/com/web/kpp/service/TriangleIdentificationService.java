package com.web.kpp.service;

import org.springframework.stereotype.Service;
import com.web.kpp.entity.Triangle;


@Service
public class TriangleIdentificationService {
    public Triangle getTriangle(int side1, int side2, int side3) {
        Triangle triangle = new Triangle(side1, side2, side3);

        triangle.identifyTriangle();

        return triangle;
    }
}
