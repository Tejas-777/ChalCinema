package com.sunbeam.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.entities.Theatre;

public interface TheatreDao extends JpaRepository<Theatre, Integer> {

}
