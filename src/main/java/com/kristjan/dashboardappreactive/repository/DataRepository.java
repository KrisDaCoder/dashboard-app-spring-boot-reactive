package com.kristjan.dashboardappreactive.repository;

import com.kristjan.dashboardappreactive.domain.Data;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends MongoRepository<Data, String> {
}
