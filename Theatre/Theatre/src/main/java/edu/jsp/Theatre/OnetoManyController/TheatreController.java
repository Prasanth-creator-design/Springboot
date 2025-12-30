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

import edu.jsp.Theatre.Movie.Theatre;
import edu.jsp.Theatre.OnetoManyService.TheatreService;

@RestController
public class TheatreController {
	@Autowired
	public TheatreService theatreService;
	
	@PostMapping("/savetheatre")
	public Theatre saveTheatre(@RequestBody Theatre t) {
		return theatreService.saveTheatre(t);
	}
	@GetMapping("/gettheatre")
	public Theatre getTheatreById( @RequestParam int id) {
		return theatreService.getTheatreById(id);
	}
	@GetMapping("/getalltheatres")
	public List<Theatre> getAllTheatres() {
		return theatreService.getAllTheatres();
	}
	@GetMapping("/gettheatrebyname")
	public Theatre getTheatreByName( @RequestParam String name) {
		return theatreService.getTheatreByName(name);
	}
	@DeleteMapping("/deletetheatre/{id}")
	public void deleteTheatre( @PathVariable int id) {
		theatreService.deleteTheatre(id);
	}
	@PutMapping("/updatetheatre/{id}")
	public Theatre updateTheatre(@PathVariable int id,@RequestBody Theatre newTheatre) {
		return theatreService.updateTheatre(id, newTheatre);
	}

}
