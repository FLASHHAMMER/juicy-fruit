package com.flashhammer.juicyfruit.repository;

import com.flashhammer.juicyfruit.model.SyncBoundedQueue;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface QueueCassandraRepository extends ReactiveCassandraRepository<SyncBoundedQueue, Integer> {

    @AllowFiltering
    Flux<SyncBoundedQueue> findAllById(Integer id);

    Mono<SyncBoundedQueue> insert(String value);

}
