package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Model
@Getter
@Setter
@NoArgsConstructor

public class TemperatureModel {
    private double celsius;

    public double getFahrenheit() {
        return celsius * 9 / 5 + 32;

    }


}
