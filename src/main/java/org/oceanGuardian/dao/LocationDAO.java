package org.oceanGuardian.dao;

import org.oceanGuardian.api.models.location;
import org.oceanGuardian.dao.interfaces.location_dao;
import org.oceanGuardian.db.databaseContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class LocationDAO implements location_dao {

    Connection connection;

    @Override
    public List<location> getAllLocations() {
        connection = databaseContext.getConnection();
        PreparedStatement commandSql = null;

        try{
            commandSql = connection.prepareStatement("select * from location");

            ResultSet result  = commandSql.executeQuery();

            connection.close();
            commandSql.close();

            ;
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public location getLocationById(Long id) {
        return null;
    }

    @Override
    public location createLocation(location location) {
        return null;
    }

    @Override
    public location updateLocation(location location) {
        return null;
    }

    @Override
    public void deleteLocation(Long id) {

    }
}
