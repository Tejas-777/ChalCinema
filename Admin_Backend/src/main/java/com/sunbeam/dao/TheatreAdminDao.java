package com.sunbeam.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.entities.TheatreAdmin;

public interface TheatreAdminDao extends JpaRepository<TheatreAdmin, Integer>{
	Optional<TheatreAdmin> findByEmail(String email);
}
