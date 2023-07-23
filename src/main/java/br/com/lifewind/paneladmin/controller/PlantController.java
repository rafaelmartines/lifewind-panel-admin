package br.com.lifewind.paneladmin.controller;

import br.com.lifewind.paneladmin.domain.Plant;
import br.com.lifewind.paneladmin.record.CreatePlant;
import br.com.lifewind.paneladmin.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/plants")
public class PlantController {

    @Autowired
    private PlantRepository repository;

    @GetMapping()
    public String listPlants(Model model) {
        model.addAttribute("list", repository.findAll());
        return "plants/list";
    }

    @PostMapping("/create")
    @Transactional
    public String savePlants(CreatePlant data) {
        var plant = new Plant(data);
        repository.save(plant);

        return "redirect:/plants";
    }

    @GetMapping("/create")
    @Transactional
    public String createPlants() {
        return "plants/create";
    }

    @GetMapping("/{plantId}")
    public String viewPlant(@PathVariable("plantId") Long plantId, Model model) {
        var plant = repository.getReferenceById(plantId);
        model.addAttribute("plant", plant);

        return "plants/view";
    }
}
