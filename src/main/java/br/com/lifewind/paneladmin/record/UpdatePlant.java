package br.com.lifewind.paneladmin.record;

public record UpdatePlant(Long plantId, String name, Boolean active) {

    public Boolean active() {
        if (active != null) {
            return active;
        }
        return false;
    }
}
