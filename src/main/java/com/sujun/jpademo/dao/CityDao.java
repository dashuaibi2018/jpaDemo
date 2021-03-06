package com.sujun.jpademo.dao;

import com.sujun.jpademo.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CityDao extends JpaRepository<City, Integer> {

}