package com.sunbeam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.dao.MovieDao;
import com.sunbeam.dao.ScreenDao;
import com.sunbeam.dao.ShowDao;
import com.sunbeam.dao.TimeDao;
import com.sunbeam.entities.Movie;
import com.sunbeam.entities.Show;

@Service
public class ShowServiceImpl implements ShowService {
	

    @Autowired
    private MovieDao movieRepository;

    @Autowired
    private ScreenDao screenRepository;

    @Autowired
    private TimeDao timeSlotRepository;

	@Autowired
	private ShowDao showRepository;
	
	
	@Override
	public Show addShow(Show show) {
		 if (show.getMovie() != null) {
		        Movie movie = movieRepository.findById(show.getMovie().getMovieId())
		                        .orElseThrow(() -> new RuntimeException("Movie not found!"));
		        show.setMovie(movie); // Attach the existing movie to show
		    }
		    return showRepository.save(show);
	}

}
