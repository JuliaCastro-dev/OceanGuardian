package org.oceanGuardian.api.models;

public class indicator {

    private Long id;
    private String name;
    private String unit;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public indicator() {}

    public indicator (Long id, String name, String unit, String description) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.description = description;
    }

}
