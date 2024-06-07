package org.oceanGuardian.dao.interfaces;

import org.oceanGuardian.api.models.indicator;

import java.util.List;

public interface  indicator_dao {

        List<indicator> getAllIndicators();

        indicator getIndicatorById(Long id);

        indicator createIndicator(indicator indicator);

        indicator updateIndicator(indicator indicator);

        void deleteIndicator(Long id);
}

