package com.flashhammer.juicyfruit.controller;

import com.flashhammer.juicyfruit.model.SyncBoundedQueue;
import com.flashhammer.juicyfruit.service.CassandraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("syncBoundedQueue")
public class CassandraController {

    @Autowired
    CassandraService cassandraService;

    @GetMapping("/{id}")
    public Flux<SyncBoundedQueue> getSyncBoundedQueue(Integer id) {
        return cassandraService.getSyncBoundedQueueById(id);
    }

    @PutMapping("/{value}")
    public Mono<SyncBoundedQueue> putSyncBoundedQueueByValue( String value) {
        return cassandraService.putSyncBoundedQueueByValue(value);
    }

}
