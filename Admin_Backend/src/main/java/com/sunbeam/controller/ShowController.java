package com.sunbeam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.entities.Show;
import com.sunbeam.service.ShowServiceImpl;

@RestController
@RequestMapping("/theatre_admin")
public class ShowController {

    @Autowired
    private ShowServiceImpl showService;

    @PostMapping("/show")
    public ResponseEntity<String> addShow(@RequestBody Show show) {
        Show savedShow = showService.addShow(show);
        return new ResponseEntity<>("Show added successfully with ID: " + savedShow.getShowId(), HttpStatus.CREATED);
    }
}
