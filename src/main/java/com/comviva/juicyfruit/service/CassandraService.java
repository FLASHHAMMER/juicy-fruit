package com.comviva.juicyfruit.service;

import com.comviva.juicyfruit.model.SyncBoundedQueue;
import com.comviva.juicyfruit.repository.QueueCassandraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CassandraService {

    @Autowired
    QueueCassandraRepository queueCassandraRepository;

    public Mono<SyncBoundedQueue> getSyncBoundedQueueById(String id ) {
        return queueCassandraRepository.findById(id);
    }

    public Mono<SyncBoundedQueue> putSyncBoundedQueueByValue( SyncBoundedQueue syncBoundedQueue ) {
        return queueCassandraRepository.insert(syncBoundedQueue);
    }

    public Mono<Void> deleteSyncBoundedQueueById( String id ) {
        return queueCassandraRepository.deleteById(id);
    }

    public Mono<Void> deleteSyncBoundedQueueByValue( SyncBoundedQueue syncBoundedQueue ) {
        return queueCassandraRepository.delete(syncBoundedQueue);
    }

    public Flux<SyncBoundedQueue> getSyncBoundedQueueAll() {
        return queueCassandraRepository.findAll();
    }
}
