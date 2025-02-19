package com.sunbeam.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.entities.Theatre;
import com.sunbeam.models.TheatreModel;
import com.sunbeam.service.TheatreService;

@RestController
@RequestMapping("/theatre_admin")
public class TheatreController {
	
	@Autowired
    private TheatreService theatreService;
	
	

    @PostMapping("/theatre")
    public ResponseEntity<String> addTheatre(@RequestBody TheatreModel request) {
        try {
            String response = theatreService.addTheatre(request);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }
	
    @GetMapping("/theatre/{id}")
    public ResponseEntity<Theatre> getTheatreById(@PathVariable("id") int theatreId) {
        Optional<Theatre> theatre = theatreService.getTheatreById(theatreId);
        return theatre.map(ResponseEntity::ok)
                      .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
    
    
  
	
	
}
