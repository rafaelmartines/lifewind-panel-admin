package br.com.lifewind.paneladmin.controller.api;

import br.com.lifewind.paneladmin.record.CreatePlant;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/plants")
public class PlantApiController {

    @PostMapping
    public void createPlantsApi(@RequestBody CreatePlant dados) {
        System.out.println(dados.name());
    }
}
