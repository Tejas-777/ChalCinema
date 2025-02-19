package com.sunbeam.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.dao.TheatreAdminDao;
import com.sunbeam.entities.TheatreAdmin;

@Service
public class TheatreAdminServiceImpl implements TheaterAdminService {
	
	@Autowired
	private TheatreAdminDao adminRepository;

	@Override
	public boolean authenticate(String email, String password) {
		System.out.println(email + "  " + password);
		   Optional<TheatreAdmin> adminOpt = adminRepository.findByEmail(email);

	        if (adminOpt.isPresent()) {
	            TheatreAdmin admin = adminOpt.get();
	            System.out.println(admin.getName());
	            return password.equals(admin.getPassword()); 
	        }
	        return false;
	    }
}
