package org.oceanGuardian.api.services;

import org.oceanGuardian.api.models.location;
import org.oceanGuardian.dao.interfaces.location_dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    @Autowired
    private location_dao locationDAO;

    public List<location> getAllLocations() {
        return locationDAO.getAllLocations();
    }

    public location getLocationById(Long id) {
        return locationDAO.getLocationById(id);
    }

    public location createLocation(location location) {
        location savedLocation = locationDAO.createLocation(location);
        return savedLocation;
    }

    public location updateLocation(location location) {
        location updatedLocation = locationDAO.updateLocation(location);
        return updatedLocation;
    }

    public void deleteLocation(Long id) {
        locationDAO.deleteLocation(id);
    }
}

