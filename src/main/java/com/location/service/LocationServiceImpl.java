package com.location.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.location.entity.Location;
import com.location.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	private LocationRepository locationRepo;

	@Override
	public void saveLocation(Location location) {
		locationRepo.save(location);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Location> getLocation() {
		List<Location> findAll = locationRepo.findAll();
		return findAll;
	}

	@Override
	public void deletelocation(Long id) {
		locationRepo.deleteById(id);
		
	}

	@Override
	public Location getLocation(Long id) {
		Optional<Location> findById = locationRepo.findById(id);
		Location location = findById.get();
		return location;
	}

}
