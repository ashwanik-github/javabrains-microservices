/*
 * @author : Ashwani K
 * @version :1.0
 */
package com.tcs.microservices.movieinfoservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.microservices.movieinfoservices.model.MovieInfo;

/**
 * The Class MovieInfoController.
 */
@RestController
@RequestMapping("/movies")
public class MovieInfoController {
	
	/**
	 * Gets the movie info.
	 *
	 * @param movieID the movie ID
	 * @return the movie info
	 */
	@GetMapping("/info")
	public MovieInfo getMovieInfo(Integer movieID) {
		return (new MovieInfo(123, "Titanic"));
	}
}
