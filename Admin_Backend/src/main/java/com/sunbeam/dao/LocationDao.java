package com.sunbeam.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.entities.Location;

public interface LocationDao extends JpaRepository<Location, Integer> {

}
