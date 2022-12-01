package com.example.todoexample.store;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("TODO")
@Getter
@Setter
public class TodoDoc {

    @Id
    private String id;
    private String registerDate;
    private String expiredDate;
    private String title;
    private boolean completed;

}
