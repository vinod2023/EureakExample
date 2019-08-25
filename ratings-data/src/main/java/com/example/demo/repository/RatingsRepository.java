package com.example.demo.repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Rating;
import com.example.demo.entity.UserRating;

@RestController
@RequestMapping("/ratings")
public class RatingsRepository {
	
	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable String movieId) {
		return new Rating(movieId,4);
	}
	
	@RequestMapping("/users/{userId}")
	public UserRating getRatings(@PathVariable String userId) {
		List<Rating> ratings=Arrays.asList(new Rating("1",5), new Rating("2",4));
		UserRating user=new UserRating();
		user.setUserRating(ratings);
		return user;
	}

}
