package com.sujun.jpademo.dao;

import com.sujun.jpademo.domain.City;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public class CityDao1 {

    /**
     * 在内存中虚拟出一份数据
     * List
     * Map
     * 需要保证线程安全
     *
     * @return
     */

    static Map<Integer, City> dataMap = Collections.synchronizedMap(new HashMap<>());

    public List<City> findAll() {

        return new ArrayList<>(dataMap.values());
    }

    public void save(City city) throws Exception {

        City data = dataMap.get(city.getId());
        if (data != null) {
            throw new Exception("数据已存在");
        } else {

            dataMap.put(city.getId(), city);
            System.out.println("数据已添加");
        }

    }


}