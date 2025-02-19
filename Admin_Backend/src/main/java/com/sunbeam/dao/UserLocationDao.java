package com.sunbeam.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.entities.UserLocation;

public interface UserLocationDao extends JpaRepository<UserLocation, Integer>{

}
