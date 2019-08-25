package com.example.demo.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Movie;

@RestController
@RequestMapping("/movies")
public class MovieResource {
	
	@RequestMapping("{movieId}")
	public Movie getInfo(@PathVariable("movieId") String movieId) {
		return new Movie(movieId,"ABC");
	}

}
