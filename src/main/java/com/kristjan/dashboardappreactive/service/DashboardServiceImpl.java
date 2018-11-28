package com.kristjan.dashboardappreactive.service;

import com.kristjan.dashboardappreactive.domain.Dashboard;
import com.kristjan.dashboardappreactive.repository.DashboardRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DashboardServiceImpl implements DashboardService{

    private DashboardRepository dashboardRepository;

    public DashboardServiceImpl(DashboardRepository dashboardRepository) {
        this.dashboardRepository = dashboardRepository;
    }

    @Override
    public List<Dashboard> getDashboards() {
        return this.dashboardRepository.findAll();
    }

    @Override
    public void saveDashboard(Dashboard dashboard) {
        this.dashboardRepository.save(dashboard);
    }

    @Override
    public Optional<Dashboard> getDashboard(String id) {
        return this.dashboardRepository.findById(id);
    }

    @Override
    public void deleteDashboard(String id) {
        this.dashboardRepository.deleteById(id);
    }
}
