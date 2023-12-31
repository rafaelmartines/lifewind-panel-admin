package br.com.lifewind.paneladmin.controller.api;

import br.com.lifewind.paneladmin.domain.Plant;
import br.com.lifewind.paneladmin.record.CreatePlant;
import br.com.lifewind.paneladmin.record.ListPlant;
import br.com.lifewind.paneladmin.record.UpdatePlant;
import br.com.lifewind.paneladmin.repository.PlantRepository;
import br.com.lifewind.paneladmin.service.PlantService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/plants")
public class PlantApiController {
    @Autowired
    private PlantRepository repository;

    @Autowired
    private PlantService service;

    @PostMapping
    @Transactional
    public void createPlant(@RequestBody @Valid CreatePlant data) {
        repository.save(new Plant(data));
    }

    @PutMapping
    @Transactional
    public void updatePlant(@RequestBody UpdatePlant data) {
        service.updatePlant(data);
    }

    @DeleteMapping("/{plantId}")
    @Transactional
    public void deletePlant(@PathVariable("plantId") Long plantId) {
        repository.deleteById(plantId);
    }

    @GetMapping("/{plantId}")
    public Optional<Plant> listPlantById(@PathVariable("plantId") Long plantId) {
        return repository.findById(plantId);
    }

    @GetMapping
    public List<ListPlant> listPlants() {
        return repository.findAll().stream().map(ListPlant::new).toList();
    }
}
