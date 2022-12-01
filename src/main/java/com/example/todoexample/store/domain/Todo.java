package com.example.todoexample.store.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Todo {
    private String id;
    private String registerDate;
    private String expiredDate;
    private String title;
    private boolean completed;
}
