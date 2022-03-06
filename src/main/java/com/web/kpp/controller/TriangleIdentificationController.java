package com.web.kpp.controller;

import com.web.kpp.entity.Triangle;
import com.web.kpp.service.TriangleIdentificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class TriangleIdentificationController {
    @Autowired
    private TriangleIdentificationService triangleIdentificationService;
    @GetMapping("/identification")
    public String triangleParams(
            @RequestParam(name="side1", defaultValue = "0") int side1,
            @RequestParam(name="side2", defaultValue = "0") int side2,
            @RequestParam(name="side3", defaultValue = "0") int side3,
            Model model
    ) {
        Triangle triangle = triangleIdentificationService.getTriangle(side1, side2, side3);

        model.addAttribute("side1", side1);
        model.addAttribute("side2", side2);
        model.addAttribute("side3", side3);

        model.addAttribute("rectangular", triangle.isRectangular ? "да" : "нет");
        model.addAttribute("isosceles", triangle.isIsosceles ? "да" : "нет");
        model.addAttribute("equilateral", triangle.isEquilateral ? "да" : "нет");

        return "home";
    }

}
