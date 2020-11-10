package com.sujun.jpademo.service;

import com.sujun.jpademo.domain.City;

import java.util.List;

public interface CityService {
    List<City> findAll();
    String add(Integer id, String name);
    String add(City city);

    City findOne(Integer id);
}