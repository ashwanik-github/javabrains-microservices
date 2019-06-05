package com.tcs.microservices.ratingdataservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.microservices.ratingdataservices.model.RatingData;

@RestController
@RequestMapping("/ratings")
public class RatingController {
	@GetMapping("/{movieID}")
	public RatingData getMovieRatings(@PathVariable String movieID) {

		return (new RatingData(movieID, 7.8));
	}
}
