package com.location.service;

import java.util.List;

import com.location.entity.Location;

public interface LocationService {

	public void saveLocation(Location location);

	public List<Location> getLocation();

	public void deletelocation(Long id);

	public Location getLocation(Long id);

}
