package org.oceanGuardian.dao.interfaces;

import org.oceanGuardian.api.models.location;

import java.util.List;

public interface location_dao {

    List<location> getAllLocations();

    location getLocationById(Long id);

    location createLocation(location location);

    location updateLocation(location location);

    void deleteLocation(Long id);
}
