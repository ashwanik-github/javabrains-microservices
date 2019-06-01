/*
 * @author : Ashwani K
 * @version :1.0
 */
package com.tcs.microservices.moviecatalogservices.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * The Class CatalaogItem.
 */

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Data

/**
 * Instantiates a new catalaog item.
 */
@RequiredArgsConstructor
public class CatalaogItem {

	/** The name. */
	private String name;

	/** The desc. */
	private String desc;

	/** The rating. */
	private Double rating;

	public CatalaogItem(String name, String desc, Double rating) {
		super();
		this.name = name;
		this.desc = desc;
		this.rating = rating;
	}

}
