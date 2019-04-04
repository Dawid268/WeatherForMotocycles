package com.weatherformotocycles.demo.Controller;

import com.weatherformotocycles.demo.Model.Weather;
import com.weatherformotocycles.demo.Services.WeatherService;
import net.aksingh.owmjapis.api.APIException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WeatherController
{
    
    @Autowired
    private WeatherService weatherService;
    @GetMapping("/get")
    public List<String> getCitiesList(){
        List<String> strings = new ArrayList<>();
        strings.add("Kielce");
        strings.add("Połaniec");
        return strings;
    }
    
    @GetMapping("/info")
    public List<Weather> getWeather() throws APIException
    {
        return  weatherService.getInformation();
    }
    
    @PostMapping("/add")
    public List<String> getCities(@RequestBody List<String> cities){
        return weatherService.getCities(cities);
    }
}
