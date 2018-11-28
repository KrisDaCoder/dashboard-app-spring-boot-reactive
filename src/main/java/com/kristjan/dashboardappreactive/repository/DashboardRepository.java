package com.kristjan.dashboardappreactive.repository;

import com.kristjan.dashboardappreactive.domain.Dashboard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DashboardRepository extends MongoRepository<Dashboard, String> {
}
