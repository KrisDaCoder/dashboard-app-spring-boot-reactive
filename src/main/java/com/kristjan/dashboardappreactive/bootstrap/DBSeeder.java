package com.kristjan.dashboardappreactive.bootstrap;

import com.kristjan.dashboardappreactive.domain.Data;
import com.kristjan.dashboardappreactive.repository.DashboardRepository;
import com.kristjan.dashboardappreactive.repository.DataRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBSeeder implements CommandLineRunner {

    private DataRepository dataRepository;
    private DashboardRepository dashboardRepository;

    public DBSeeder(DataRepository dataRepository, DashboardRepository dashboardRepository) {
        this.dataRepository = dataRepository;
        this.dataRepository = dataRepository;
    }

    @Override
    public void run(String... args) throws Exception {

//        Data data = new Data(
//                Arrays.asList("Dzeko", "Messi", "Dybala", "Kane", "Lewandowski"),
//                Arrays.asList(5, 5, 4, 4, 4)
//        );
//
//        this.dataRepository.deleteAll();
//        this.dataRepository.save(data);


    }
}
