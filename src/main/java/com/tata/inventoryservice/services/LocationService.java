package com.tata.inventoryservice.services;

import java.util.List;

import com.tata.inventoryservice.models.Location;
import com.tata.inventoryservice.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class LocationService {

	@Autowired
	private LocationRepository locationRepo;

	//insert
	
		public Location addLocation(Location location)
		{
						
	    	return this.locationRepo.save(location);
			
		}
		
		
		//select
		public List<Location> getAllLocations()
		{
			 
			return  locationRepo.findAll();
			
		}
		
		//select
				public Location getLocationById(long locationId)
				{
					 
					return  locationRepo.findById(locationId).orElse(null);
					
				}
		
}
