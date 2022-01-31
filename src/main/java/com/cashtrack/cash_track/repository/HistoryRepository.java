package com.cashtrack.cash_track.repository;

import com.cashtrack.cash_track.domain.HistoryLog;
import org.hibernate.boot.model.source.spi.HibernateTypeSource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<HistoryLog, Integer> {

    public HistoryLog findBySearch(String searchStr);

}
