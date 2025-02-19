package com.sunbeam.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.entities.Movie;

public interface MovieDao extends JpaRepository<Movie, Integer>{

}
