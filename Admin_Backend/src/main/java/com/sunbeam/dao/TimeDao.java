package com.sunbeam.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.entities.Time;

public interface TimeDao extends JpaRepository<Time, Integer>{

}
