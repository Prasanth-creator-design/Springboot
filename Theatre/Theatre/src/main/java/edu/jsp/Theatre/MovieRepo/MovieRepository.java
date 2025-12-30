package edu.jsp.Theatre.MovieRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.jsp.Theatre.Movie.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

	public Movie findByName(String name);
}
