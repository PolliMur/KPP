package com.web.kpp.service;

import com.web.kpp.exceptions.TriangleDoesNotExistException;
import org.springframework.stereotype.Service;
import com.web.kpp.entity.TriangleIdentification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Service
public class TriangleIdentificationService {
    private static final Logger logger = LogManager.getLogger(TriangleIdentificationService.class);
    private void validateTriangle (int side1, int side2, int side3) {
        if (
                side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1
        ) {
            logger.error("Identify error! Wrong sides length.");
            throw new TriangleDoesNotExistException("Triangle does not exist!");
        }
    }

    public TriangleIdentification identify(int side1, int side2, int side3) {
        validateTriangle(side1, side2, side3);

        TriangleIdentification triangleIdentification = new TriangleIdentification();

        triangleIdentification.setIsEquilateral(side1 == side2 && side2 == side3);
        triangleIdentification.setIsIsosceles(side1 == side2 || side2 == side3 || side1 == side3);
        triangleIdentification.setIsRectangular(
                Math.pow(side1, 2) == Math.pow(side2, 2) + Math.pow(side3, 2) ||
                        Math.pow(side2, 2) == Math.pow(side1, 2) + Math.pow(side3, 2) ||
                        Math.pow(side3, 2) == Math.pow(side1, 2) + Math.pow(side2, 2)
        );

        logger.info("Successful identify!");

        return triangleIdentification;
    }
}
