package org.oceanGuardian.dao.interfaces;

import org.oceanGuardian.api.models.indicator;
import org.oceanGuardian.api.models.location;
import org.oceanGuardian.api.models.measurement;

import java.time.LocalDateTime;
import java.util.List;

public interface measurent_dao {
    public interface MeasurementDAO {

        List<measurement> getAllMeasurements();

        List<measurement> getMeasurementsByLocation(location location);

        List<measurement> getMeasurementsByIndicator(indicator indicator);

        List<measurement> getMeasurementsByDateRange(LocalDateTime startDate, LocalDateTime endDate);

        measurement getMeasurementById(Long id);

        measurement createMeasurement(measurement measurement);

        measurement updateMeasurement(measurement measurement);

        void deleteMeasurement(Long id);
    }

}
