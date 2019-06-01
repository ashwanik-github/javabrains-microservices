/*
 * @author : Ashwani K
 * @version :1.0
 */
package com.tcs.microservices.moviecatalogservices.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.microservices.moviecatalogservices.model.CatalaogItem;

/**
 * The Class CatalogController.
 */
@RestController
@RequestMapping("/catalog")
public class CatalogController {

	/**
	 * Gets the catalog.
	 *
	 * @param userID the user ID
	 * @return the catalog
	 */
	@GetMapping("{userID}")
	public List<CatalaogItem> getCatalog(@PathVariable String userID) {
		return Collections.singletonList(new CatalaogItem("Titanic",
				"Movie by James Cameron.Titanic is the world's third-highest-grossing film of all time.", 7.8));
	}
}
