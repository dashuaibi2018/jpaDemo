package com.sujun.jpademo.service;

import com.sujun.jpademo.entity.City;

import java.util.List;

public interface CityService {
    List<City> findAll();
    String add(Integer id, String name);
    String add(City city);

    City findOne(Integer id);
}