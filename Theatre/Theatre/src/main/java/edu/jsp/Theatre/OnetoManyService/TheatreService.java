package edu.jsp.Theatre.OnetoManyService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import edu.jsp.Theatre.Movie.Theatre;
import edu.jsp.Theatre.MovieRepo.TheatreRepository;

@Service
public class TheatreService {
	
	@Autowired
	public TheatreRepository theatreRepo;
	
	
	public Theatre saveTheatre(Theatre t) {
		return theatreRepo.save(t);
	}
	
	public Theatre getTheatreById(int id) {
		return theatreRepo.findById(id).orElse(null);
	}
	public List<Theatre> getAllTheatres() {
		return theatreRepo.findAll();
	}
	public Theatre getTheatreByName(String name) {
		return theatreRepo.findByName(name);
	}
	
	public void deleteTheatre( int id) {
		theatreRepo.deleteById(id);
	}
	
	public Theatre updateTheatre(int id,Theatre newTheatre) {
		Theatre existingTheatre = theatreRepo.findById(id).orElse(null);
		if(existingTheatre !=null) {
			existingTheatre.setName(newTheatre.getName());
			existingTheatre.setLocation(newTheatre.getLocation());
			return theatreRepo.save(existingTheatre);
		}
		return null;
	}

}
