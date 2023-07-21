package br.com.lifewind.paneladmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/plants")
public class PlantController {

    @GetMapping()
    public String listPlants() {
        return "plants";
    }
}
