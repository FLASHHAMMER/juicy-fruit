package com.flashhammer.juicyfruit.service;

import com.flashhammer.juicyfruit.model.SyncBoundedQueue;
import com.flashhammer.juicyfruit.repository.QueueCassandraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CassandraService {

    @Autowired
    QueueCassandraRepository queueCassandraRepository;

    public Flux<SyncBoundedQueue> getSyncBoundedQueueById(Integer id) {
        Flux<SyncBoundedQueue> syncBoundedQueue = queueCassandraRepository.findAllById(id);
        return syncBoundedQueue;
    }

    public Mono<SyncBoundedQueue> putSyncBoundedQueueByValue(String value) {
        Mono<SyncBoundedQueue> syncBoundedQueue = queueCassandraRepository.insert(value);
        return syncBoundedQueue;
    }

}
