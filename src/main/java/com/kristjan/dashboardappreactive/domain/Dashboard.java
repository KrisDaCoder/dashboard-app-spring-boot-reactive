package com.kristjan.dashboardappreactive.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "dashboards")
public class Dashboard {

    @Id
    private String id;
    private String name;
    private List<Chart> charts;

    public Dashboard() {
    }

    public Dashboard(String name, List<Chart> charts) {
        this.name = name;
        this.charts = charts;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Chart> getCharts() {
        return charts;
    }

    public void setCharts(List<Chart> charts) {
        this.charts = charts;
    }

}