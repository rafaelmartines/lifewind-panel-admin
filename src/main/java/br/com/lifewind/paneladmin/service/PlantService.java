package br.com.lifewind.paneladmin.service;

import br.com.lifewind.paneladmin.domain.Plant;
import br.com.lifewind.paneladmin.record.UpdatePlant;
import br.com.lifewind.paneladmin.repository.PlantRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class PlantService {

    @Autowired
    private PlantRepository plantRepository;

    @Transactional
    public void updatePlant(UpdatePlant data) {
        Plant plant = plantRepository.getReferenceById(data.plantId());

        if (data.name() != null) {
            plant.setName(data.name());
        }

        if (data.active() != null) {
            plant.setActive(data.active());
        }

        plant.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
    }
}
