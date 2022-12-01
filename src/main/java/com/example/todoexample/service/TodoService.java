package com.example.todoexample.service;

import com.example.todoexample.store.TodoDoc;
import com.example.todoexample.store.domain.Todo;
import com.example.todoexample.store.repository.TodoRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepo todoRepo;

}
