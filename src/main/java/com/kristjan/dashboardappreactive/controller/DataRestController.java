package com.kristjan.dashboardappreactive.controller;

import com.kristjan.dashboardappreactive.domain.Data;
import com.kristjan.dashboardappreactive.service.DataService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/data")
public class DataRestController {

    private DataService dataService;

    public DataRestController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping(value = "/all/sse",  produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Data> getData() {
        return this.dataService.getData().delayElements(Duration.ofSeconds(10));
    }

    @PutMapping("/all")
    public Data updateData(@RequestBody Data data) {
        return this.dataService.saveData(data);
    }

    @GetMapping("/all")
    public List<Data> getDataNotInFlux() {
        return this.dataService.getDataNotInFlux();
    }

}