package com.kristjan.dashboardappreactive.controller;

import com.kristjan.dashboardappreactive.domain.Dashboard;
import com.kristjan.dashboardappreactive.service.DashboardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class DashboardRestController {

    private DashboardService dashboardService;

    public DashboardRestController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @GetMapping("/dashboards")
    public List<Dashboard> getDashboards() {
        return this.dashboardService.getDashboards();
    }

    @GetMapping(value = "/dashboards/{dashboardId}")
    public Optional<Dashboard> getDashboard(@PathVariable String dashboardId) {
        return this.dashboardService.getDashboard(dashboardId);
    }

    @PutMapping("/dashboards")
    public Dashboard updateDashboard(@RequestBody Dashboard dashboard) {
        this.dashboardService.saveDashboard(dashboard);
        return dashboard;
    }

    @PostMapping("/dashboards")
    public Dashboard createDashboard(@RequestBody Dashboard dashboard) {
        this.dashboardService.saveDashboard(dashboard);
        return dashboard;
    }

    @DeleteMapping("/dashboards/{dashboardId}")
    public void deleteDashboard(@PathVariable String dashboardId) {
        this.dashboardService.deleteDashboard(dashboardId);
    }
}
