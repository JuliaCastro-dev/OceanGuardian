package org.oceanGuardian.api.models;

import java.time.LocalDateTime;

public class measurement {

    private Long id;
    private Double value;
    private LocalDateTime date;
    private location location;
    private indicator indicator;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public org.oceanGuardian.api.models.location getLocation() {
        return location;
    }

    public void setLocation(org.oceanGuardian.api.models.location location) {
        this.location = location;
    }

    public org.oceanGuardian.api.models.indicator getIndicator() {
        return indicator;
    }

    public void setIndicator(org.oceanGuardian.api.models.indicator indicator) {
        this.indicator = indicator;
    }

    public measurement() {}

    public measurement(Long id, Double value, LocalDateTime date, location location, indicator indicator) {
        this.id = id;
        this.value = value;
        this.date = date;
        this.location = location;
        this.indicator = indicator;
    }

}
