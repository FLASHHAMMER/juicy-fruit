package com.flashhammer.juicyfruit.model;

import com.datastax.oss.driver.api.core.uuid.Uuids;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class SyncBoundedQueue {

    @Id
    @PrimaryKey
    private String id = Uuids.timeBased().toString();
    private String value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}