package com.sunbeam.service;

import java.util.Optional;

import com.sunbeam.entities.Theatre;
import com.sunbeam.models.TheatreModel;

public interface TheatreService {
    String addTheatre(TheatreModel request);
    Optional<Theatre> getTheatreById(int theatreId);
    

	
}
