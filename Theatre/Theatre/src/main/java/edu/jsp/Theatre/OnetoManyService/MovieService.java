package edu.jsp.Theatre.OnetoManyService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jsp.Theatre.Movie.Movie;
import edu.jsp.Theatre.MovieRepo.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepo;
	
	public Movie saveMovie(Movie m) {
		return movieRepo.save(m);
	}
	
	public Movie getMovieById(int id) {
		return movieRepo.findById(id).orElse(null);
	}
	public List<Movie> getAllMovies(){
		return movieRepo.findAll();
	}
	public Movie getMovieByName(String name) {
		return movieRepo.findByName(name);
	}
	
	public void deleteMovie(int id) {
		 movieRepo.deleteById(id);
	}
	public Movie updateMovie(int id, Movie newMovie) {
		Movie existingMovie = movieRepo.findById(id).orElse(null);
		if (existingMovie != null) {
			  existingMovie.setName(newMovie.getName());
		        existingMovie.setDirector(newMovie.getDirector());
		        existingMovie.setGenre(newMovie.getGenre());
		        existingMovie.setRating(newMovie.getRating());
		        return movieRepo.save(existingMovie);
		}
		return null;
	}

}
