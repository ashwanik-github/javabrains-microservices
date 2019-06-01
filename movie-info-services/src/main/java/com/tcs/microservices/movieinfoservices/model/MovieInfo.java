/*
 * @author : Ashwani K
 * @version :1.0
 */
package com.tcs.microservices.movieinfoservices.model;

import lombok.Data;

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Data
public class MovieInfo {

	/** The movie ID. */
	private Integer movieID;

	/** The movie name. */
	private String movieName;

	/**
	 * Instantiates a new movie info.
	 *
	 * @param movieID   the movie ID
	 * @param movieName the movie name
	 */
	public MovieInfo(Integer movieID, String movieName) {
		super();
		this.movieID = movieID;
		this.movieName = movieName;
	}

}
