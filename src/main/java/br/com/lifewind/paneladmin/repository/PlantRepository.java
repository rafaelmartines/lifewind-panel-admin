package br.com.lifewind.paneladmin.repository;

import br.com.lifewind.paneladmin.domain.Plant;
import br.com.lifewind.paneladmin.record.UpdatePlant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantRepository extends JpaRepository<Plant, Long> {
}
