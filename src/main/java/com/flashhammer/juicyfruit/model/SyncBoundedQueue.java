package com.flashhammer.juicyfruit.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class SyncBoundedQueue {

    @PrimaryKey
    private int id;
    private String value;

}