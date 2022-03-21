package com.web.kpp.service;

import org.springframework.stereotype.Service;
import com.web.kpp.entity.TriangleIdentification;


@Service
public class TriangleIdentificationService {
    public TriangleIdentification identificate(int side1, int side2, int side3) {
        TriangleIdentification triangleIdentification = new TriangleIdentification();
        triangleIdentification.setIsEquilateral(side1 == side2 && side2 == side3);
        triangleIdentification.setIsIsosceles(side1 == side2 || side2 == side3 || side1 == side3);
        triangleIdentification.setIsRectangular(
                Math.pow(side1, 2) == Math.pow(side2, 2) + Math.pow(side3, 2) ||
                        Math.pow(side2, 2) == Math.pow(side1, 2) + Math.pow(side3, 2) ||
                        Math.pow(side3, 2) == Math.pow(side1, 2) + Math.pow(side2, 2)
        );

        return triangleIdentification;
    }
}
