package edu.jsp.Theatre.OnetoManyController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.Theatre.Movie.Movie;
import edu.jsp.Theatre.OnetoManyService.MovieService;

@RestController
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@PostMapping("/savemovie")
	public Movie saveMovie( @RequestBody Movie m) {
		return movieService.saveMovie(m);
	}
	@GetMapping("/getmoviebyid")
	public Movie getMovieById(@RequestParam int id) {
		return movieService.getMovieById(id);
	}
	@GetMapping("/getallmovies")
	public List<Movie>getAllMovie(){
		return movieService.getAllMovies();
	}
	@GetMapping("/getmoviebyname")
	public Movie getMovieByName(@RequestParam String name) {
		return movieService.getMovieByName(name);
	}
	@DeleteMapping("/deletemovie/{id}")
	public void deleteMovie(@PathVariable int id) {
		movieService.deleteMovie(id);
	}
	 @PutMapping("/update/{id}")
	    public Movie updateMovie(@PathVariable int id, @RequestBody Movie movie) {

	        return movieService.updateMovie(id, movie);
	    }

}
