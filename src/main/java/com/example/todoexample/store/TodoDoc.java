package com.example.todoexample.store;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "TODO")
public class TodoDoc {

    @Id
    private int id;
    private String registerDate;
    private String expiredDate;
    private String title;
    private boolean completed;

}
