/*
 * @author Ashwani K
 */
package com.tcs.microservices.moviecatalogservices.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.tcs.microservices.moviecatalogservices.model.CatalaogItem;
import com.tcs.microservices.moviecatalogservices.model.MovieInfo;
import com.tcs.microservices.moviecatalogservices.model.RatingData;

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

		/*
		 * 1.Get all rated movies. 2.for each on movie call movie-info service to get
		 * the movie details 3.Put them all together
		 */
		RestTemplate restTemplate = new RestTemplate();
		// MovieInfo movie =
		// restTemplate.getForObject("http://localhost:8881/movies/info",MovieInfo.class);

		// getting all the movies here in the list here
		List<RatingData> ratingsList = Arrays.asList(new RatingData(123, 7.8), new RatingData(224, 6.8),
				new RatingData(336, 7.9));

		// now we will stream them in this form
		return ratingsList.stream().map(ratings -> {
			MovieInfo movieInfo = restTemplate.getForObject("http://localhost:8881/movies/" + ratings.getMovieID(),
					MovieInfo.class);
			return new CatalaogItem(movieInfo.getMovieID(), "DESC...", ratings.getRating());
		}).collect(Collectors.toList());

//		return Collections.singletonList(new CatalaogItem("Titanic",
//				"Movie by James Cameron.Titanic is the world's third-highest-grossing film of all time.", 7.8));
	}
}
