package com.weatherformotocycles.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Weather
{
    private String cityName;
    private double temp;
    private double wind;
    private boolean rain;
    
    @Override
    public String toString()
    {
        return "Weather{" +
               "cityName='" + cityName + '\'' +
               ", temp=" + temp +
               ", wind=" + wind +
               ", rain=" + rain +
               '}';
    }
}
