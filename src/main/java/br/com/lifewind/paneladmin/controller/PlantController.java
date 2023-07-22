package br.com.lifewind.paneladmin.controller;

import br.com.lifewind.paneladmin.domain.Plant;
import br.com.lifewind.paneladmin.record.CreatePlant;
import br.com.lifewind.paneladmin.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/plants")
public class PlantController {

    @Autowired
    private PlantRepository repository;

    @GetMapping()
    public String listPlants() {
        return "plants";
    }

    @PostMapping()
    @Transactional
    public String createPlants(CreatePlant data) {
        System.out.println(data);
        var plant = new Plant(data);
        repository.save(plant);

        return "plants";
    }
}
