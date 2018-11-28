package com.kristjan.dashboardappreactive.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "data")
public class Data {

    @Id
    private String id;
    private List<String> labels;
    private List<Integer> values;

    public Data() {
    }

    public Data(List<String> labels, List<Integer> values) {
        this.labels = labels;
        this.values = values;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public List<Integer> getValues() {
        return values;
    }

    public void setValues(List<Integer> values) {
        this.values = values;
    }
}
