package com.kristjan.dashboardappreactive.repository;

import com.kristjan.dashboardappreactive.domain.Data;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactiveDataRepository extends ReactiveMongoRepository<Data, String> {
}
