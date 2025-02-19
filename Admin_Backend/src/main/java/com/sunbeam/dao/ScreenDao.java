package com.sunbeam.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.entities.Screen;

public interface ScreenDao extends JpaRepository<Screen, Integer> {

}
