package com.sunbeam.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.entities.City;

public interface CityDao extends JpaRepository<City, Integer>{

}
