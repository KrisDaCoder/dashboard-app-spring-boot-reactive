package com.kristjan.dashboardappreactive.service;

import com.kristjan.dashboardappreactive.domain.Dashboard;

import java.util.List;
import java.util.Optional;

public interface DashboardService {

    List<Dashboard> getDashboards();

    void saveDashboard(Dashboard dashboard);

    Optional<Dashboard> getDashboard(String id);

    void deleteDashboard(String id);


}
