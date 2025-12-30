package edu.jsp.Theatre.MovieRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import edu.jsp.Theatre.Movie.Theatre;

@Repository
public interface TheatreRepository extends JpaRepository<Theatre, Integer> {

	public Theatre findByName(String name);
}

