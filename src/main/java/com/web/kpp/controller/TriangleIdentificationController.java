package com.web.kpp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import com.web.kpp.service.TriangleIdentificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TriangleIdentificationController {
    @Autowired
    private TriangleIdentificationService triangleIdentificationService;
    @GetMapping("/identification")
    public ResponseEntity<Object> triangleParams(
            @RequestParam(name="side1", defaultValue = "0") int side1,
            @RequestParam(name="side2", defaultValue = "0") int side2,
            @RequestParam(name="side3", defaultValue = "0") int side3
    ) {
        return new ResponseEntity<>(triangleIdentificationService.identificate(side1, side2, side3), HttpStatus.OK);
    }

}
