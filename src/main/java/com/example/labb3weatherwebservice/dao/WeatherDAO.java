package com.example.labb3weatherwebservice.dao;

import java.util.List;

public interface WeatherDAO{

    List<Double> getAllWeatherSMHI();
    List<Double> getAllWeatherMET();
}
