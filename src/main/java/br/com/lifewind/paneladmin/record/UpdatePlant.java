package br.com.lifewind.paneladmin.record;

public record UpdatePlant(Long plantId, String name, Boolean active) {

    public Boolean active() {
        return (active != null) ? active : false;
    }
}
