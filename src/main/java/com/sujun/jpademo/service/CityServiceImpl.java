package com.sujun.jpademo.service;

import com.sujun.jpademo.dao.CityDao;
import com.sujun.jpademo.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityDao cityDao;


    @Override
    public List<City> findAll() {

        return cityDao.findAll();
    }


    public String add(Integer id, String name) {

        City city = new City();
        city.setId(id);
        city.setName(name);

        try {
            cityDao.save(city);
            return "保存成功";
        } catch (Exception e) {
            return "保失败";
        }

    }


    public String add(City city) {

        try {
            cityDao.save(city);
            return "保存成功";
        } catch (Exception e) {
            return "保失败";
        }

    }

    @Override
    public City findOne(Integer id) {
        return cityDao.findById(id).get();
    }

}