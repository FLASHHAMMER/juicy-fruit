package com.flashhammer.juicyfruit.repository;

import com.flashhammer.juicyfruit.model.SyncBoundedQueue;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueueCassandraRepository extends ReactiveCassandraRepository<SyncBoundedQueue, String> {

}
