package br.com.lifewind.paneladmin.record;

public record CreatePlant(String name, Boolean active) {

    public Boolean active() {
        return (active != null) ? active : false;
    }
}
