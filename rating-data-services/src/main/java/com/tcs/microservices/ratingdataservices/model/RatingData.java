/*
 * @author Ashwani K
 */
package com.tcs.microservices.ratingdataservices.model;

import lombok.Data;

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Data
public class RatingData {

	/** The movie ID. */
	private String movieID;

	/** The rating. */
	private Double rating;

	/**
	 * Instantiates a new rating data.
	 *
	 * @param movieID the movie ID
	 * @param rating  the rating
	 */
	public RatingData(String movieID, Double rating) {
		super();
		this.movieID = movieID;
		this.rating = rating;
	}

}
