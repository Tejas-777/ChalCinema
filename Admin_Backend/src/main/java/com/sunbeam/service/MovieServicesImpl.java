package com.sunbeam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.dao.MovieDao;
import com.sunbeam.entities.Movie;
import com.sunbeam.models.MovieModel;

@Service
public class MovieServicesImpl implements MovieServices {

	@Autowired
	private MovieDao movieDoa;
	
	

	@Override
	public String addMovie(MovieModel movieModel) {
		com.sunbeam.entities.Movie movie = new Movie();
	    movie.setMovieName(movieModel.getMovieName());
	    movie.setDescription(movieModel.getDescription());
	    movie.setDuration(movieModel.getDuration());
	    movie.setGenre(movieModel.getGenre());
	    movie.setReleaseDate(movieModel.getReleaseDate());
	    movie.setLanguage(movieModel.getLanguage());

	    movieDoa.save(movie);
        return "success";
	}
	
	

}
