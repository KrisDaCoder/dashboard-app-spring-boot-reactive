package com.kristjan.dashboardappreactive.service;

import com.kristjan.dashboardappreactive.domain.Data;
import reactor.core.publisher.Flux;

import java.util.List;

public interface DataService {

    Flux<Data> getData();
    Data saveData(Data data);
    List<Data> getDataNotInFlux();

}
