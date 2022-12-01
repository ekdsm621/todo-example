package com.example.todoexample.store.repository;

import com.example.todoexample.store.TodoDoc;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TodoRepo extends MongoRepository<TodoDoc, String> {
}
