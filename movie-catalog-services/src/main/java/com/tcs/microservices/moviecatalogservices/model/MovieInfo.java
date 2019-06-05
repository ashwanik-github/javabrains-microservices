/*
 * @author Ashwani K
 */
package com.tcs.microservices.moviecatalogservices.model;

import lombok.Data;

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Data
public class MovieInfo {

	/** The movie ID. */
	private String movieID;

	/** The movie name. */
	private String movieName;

	/**
	 * Instantiates a new movie info.
	 */
	public MovieInfo() {

	}

	/**
	 * Instantiates a new movie info.
	 *
	 * @param movieID   the movie ID
	 * @param movieName the movie name
	 */
	public MovieInfo(String movieID, String movieName) {
		super();
		this.movieID = movieID;
		this.movieName = movieName;
	}

}
