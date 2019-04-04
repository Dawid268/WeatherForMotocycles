package com.weatherformotocycles.demo.Services;

import com.weatherformotocycles.demo.API.OWMApi;
import com.weatherformotocycles.demo.Model.Weather;
import net.aksingh.owmjapis.api.APIException;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherService
{
    List<String> cities;
    
    public List<String> getCities(List<String> citiesList)
    {
        cities = new ArrayList<>();
        cities = citiesList;
        System.out.println(cities.size());
        return cities;
    }
    
    public List<Weather> getInformation() throws APIException
    {
        return OWMApi.WeatherService(cities);
    }
}
