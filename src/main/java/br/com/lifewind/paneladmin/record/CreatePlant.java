package br.com.lifewind.paneladmin.record;

import jakarta.validation.constraints.NotBlank;

public record CreatePlant(
        @NotBlank
        String name,
        Boolean active
) {

    public Boolean active() {
        return active != null;
    }
}
