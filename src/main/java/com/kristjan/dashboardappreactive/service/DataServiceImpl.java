package com.kristjan.dashboardappreactive.service;

import com.kristjan.dashboardappreactive.domain.Data;
import com.kristjan.dashboardappreactive.repository.DataRepository;
import com.kristjan.dashboardappreactive.repository.ReactiveDataRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public class DataServiceImpl implements DataService {

    private DataRepository dataRepository;
    private ReactiveDataRepository reactiveDataRepository;

    public DataServiceImpl(DataRepository dataRepository, ReactiveDataRepository reactiveDataRepository) {
        this.dataRepository = dataRepository;
        this.reactiveDataRepository = reactiveDataRepository;
    }

    public Flux<Data> getData() {
        return this.reactiveDataRepository.findAll();
    }

    public Data saveData(Data data) {
        return this.dataRepository.save(data);
    }

    public List<Data> getDataNotInFlux() {
        return this.dataRepository.findAll();
    }
}
