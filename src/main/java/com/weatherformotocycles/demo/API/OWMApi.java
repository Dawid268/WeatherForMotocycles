package com.weatherformotocycles.demo.API;

import com.weatherformotocycles.demo.Model.Weather;
import net.aksingh.owmjapis.api.APIException;
import net.aksingh.owmjapis.core.OWM;
import net.aksingh.owmjapis.model.CurrentWeather;

import java.util.ArrayList;
import java.util.List;

public class OWMApi
{
    private static final String apiKey = "";
    public static final double kelwin = 273.15;
    
    public static List<Weather> WeatherService(List<String> cities) throws APIException
    {
        OWM owm = new OWM(apiKey);
        List<Weather> weatherList = new ArrayList<>();
        CurrentWeather cwd;
        for(String city : cities)
        {
            cwd = owm.currentWeatherByCityName(city);
            String cityName = cwd.getCityName();
            double temp = cwd.getMainData().getTemp() - kelwin;
            double wind = Double.parseDouble(String.valueOf(cwd.getWindData().getSpeed()));
            boolean rain;
            if(cwd.getRainData() == null)
            {
                rain = false;
            }
            else
            {
                rain = true;
            }
            Weather weather1 = new Weather(cityName, temp, wind, rain);
            weatherList.add(weather1);
        }
        return weatherList;
    }
}
