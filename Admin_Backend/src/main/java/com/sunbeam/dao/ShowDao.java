package com.sunbeam.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.entities.Show;

public interface ShowDao extends JpaRepository<Show, Integer>{

}
