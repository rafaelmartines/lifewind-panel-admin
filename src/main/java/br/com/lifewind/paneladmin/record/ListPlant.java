package br.com.lifewind.paneladmin.record;

import br.com.lifewind.paneladmin.domain.Plant;

public record ListPlant(Long plantId, String name) {

    public ListPlant(Plant plant) {
        this(plant.getPlantId(), plant.getName());
    }
}
