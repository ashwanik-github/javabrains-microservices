/*
 * @author Ashwani K
 */
package com.tcs.microservices.moviecatalogservices.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Data
@RequiredArgsConstructor
public class RatingData {

	/** The movie ID. */
	private Integer movieID;

	/** The rating. */
	private Double rating;

	/**
	 * Instantiates a new rating data.
	 *
	 * @param movieID the movie ID
	 * @param rating  the rating
	 */
	public RatingData(Integer movieID, Double rating) {
		super();
		this.movieID = movieID;
		this.rating = rating;
	}

}
