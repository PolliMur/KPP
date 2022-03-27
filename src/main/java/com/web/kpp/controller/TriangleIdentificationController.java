package com.web.kpp.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;

import com.web.kpp.service.TriangleIdentificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.constraints.Positive;

@RestController
@Validated
public class TriangleIdentificationController {
    @Autowired
    private TriangleIdentificationService triangleIdentificationService;

    private static final Logger logger = LogManager.getLogger(ResponseEntityExceptionHandler.class);

    @GetMapping("/identification")
    public ResponseEntity<Object> triangleParams(
            @RequestParam(name="side1", required = true) @Positive(message = "Value must be positive!") int side1,
            @RequestParam(name="side2", required = true) @Positive(message = "Value must be positive!") int side2,
            @RequestParam(name="side3", required = true) @Positive(message = "Value must be positive!") int side3
    ) {
        logger.info("GET /identification");

        return ResponseEntity.ok(
                triangleIdentificationService.identify(side1, side2, side3)
        );
    }

}
