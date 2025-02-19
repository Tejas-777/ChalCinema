package com.sunbeam.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.dao.CityDao;
import com.sunbeam.dao.TheatreAdminDao;
import com.sunbeam.dao.TheatreDao;
import com.sunbeam.entities.City;
import com.sunbeam.entities.Theatre;
import com.sunbeam.entities.TheatreAdmin;
import com.sunbeam.models.TheatreModel;

@Service
public class TheatreServiceImpl implements TheatreService{
    @Autowired
	private TheatreDao theatreDao;

    @Autowired
    private TheatreAdminDao adminRepository;

    @Autowired
    private CityDao cityRepository;
    @Autowired
    private TheatreDao theatreRepository;

	
	

	    public String addTheatre(TheatreModel request) {
	        TheatreAdmin admin = adminRepository.findById(request.getAdminId())
	                .orElseThrow(() -> new RuntimeException("Admin not found"));

	        City city = cityRepository.findById(request.getCityId())
	                .orElseThrow(() -> new RuntimeException("City not found"));

	        Theatre theatre = new Theatre();
	        theatre.setName(request.getName());
	        theatre.setNo_of_screens(request.getNumberOfScreens());
	        theatre.setTheatreAdmin(admin);
	        theatre.setCity(city);

	        theatreDao.save(theatre);
	        return "Success";
	    }




		@Override
		public Optional<Theatre> getTheatreById(int theatreId) {
			return theatreRepository.findById(theatreId);
		}


}
	
	
	


