package com.location.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.location.entity.Location;
import com.location.repository.LocationRepository;

@RestController
public class LocationRestController {
	@Autowired
	private LocationRepository locationRepo;
	
	@GetMapping("/getLocations")
	public List<Location> retrieveLocations(){
		List<Location> findAll = locationRepo.findAll();
		return findAll;
	}
	
	@PostMapping("/saveLocation")
	public void saveLocations(@RequestBody Location location) {
		locationRepo.save(location);
	}
	
	@DeleteMapping("/deleteLocations/{id}")
	public void deleteLocations(@PathVariable ("id") Long id) {
		locationRepo.deleteById(id);
	}
	
	@RequestMapping("/findLocation/{id}")
	public Location findLocation(@PathVariable("id") Long id) {
		Optional<Location> findById = locationRepo.findById(id);
		Location location = findById.get();
		return location;
	}

}
