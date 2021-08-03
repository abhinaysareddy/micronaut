package com.test.micronaut.controller;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.http.annotation.PathVariable;

@Introspected //required
public class StudentBean {

    @PathVariable
    private long id;


    @PathVariable
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
