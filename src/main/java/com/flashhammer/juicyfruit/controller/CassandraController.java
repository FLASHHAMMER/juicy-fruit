package com.flashhammer.juicyfruit.controller;

import com.flashhammer.juicyfruit.model.SyncBoundedQueue;
import com.flashhammer.juicyfruit.service.CassandraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("syncBoundedQueue")
public class CassandraController {

    @Autowired
    CassandraService cassandraService;

    @GetMapping
    public Flux<SyncBoundedQueue> getSyncBoundedQueueAll() {
        return cassandraService.getSyncBoundedQueueAll();
    }
    @GetMapping("/{id}")
    public Mono<SyncBoundedQueue> getSyncBoundedQueueById( @PathVariable String id ) {
        return cassandraService.getSyncBoundedQueueById(id);
    }

    @PostMapping
    public Mono<SyncBoundedQueue> putSyncBoundedQueueByValue( SyncBoundedQueue syncBoundedQueue ) {
        return cassandraService.putSyncBoundedQueueByValue(syncBoundedQueue);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteSyncBoundedQueueById( @PathVariable String id ) {
        return cassandraService.deleteSyncBoundedQueueById(id);
    }

    @DeleteMapping
    public Mono<Void> deleteSyncBoundedQueueByValue( SyncBoundedQueue syncBoundedQueue ) {
        return cassandraService.deleteSyncBoundedQueueByValue(syncBoundedQueue);
    }
}
