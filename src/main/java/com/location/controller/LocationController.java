package com.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.location.entity.Location;
import com.location.service.LocationService;

@Controller
public class LocationController {
	@Autowired
	private LocationService locationService;
	
	@RequestMapping("location")
	public String loadSaveLocation() {
		return "saveLocation";
	}
	
	@RequestMapping("/saveLoc")
	public String saveLocationDetails(@ModelAttribute("location") Location location,ModelMap modelMap) {
		locationService.saveLocation(location);
		modelMap.addAttribute("msg","location saved!!");
		return "saveLocation";
	}
	@RequestMapping("/get")
	public String getLocations(ModelMap modelMap) {
		List<Location> location = locationService.getLocation();
		modelMap.addAttribute("location",location);
		return "searchLocation";
	}
	@RequestMapping("/delete")
	public String deleteLocationDetails(@RequestParam("id") Long id,ModelMap modelMap) {
		locationService.deletelocation(id);
		List<Location> location = locationService.getLocation();
		modelMap.addAttribute("location",location);
		return "searchLocation";
	}
	@RequestMapping("/update")
	public String searchLocationDetails(@RequestParam("id") Long id,ModelMap modelMap) {
		Location location = locationService.getLocation(id);
		modelMap.addAttribute("location",location);
		return "locationDetails";
	}

}
