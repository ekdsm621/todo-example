package com.example.todoexample.store.repository;

import com.example.todoexample.store.TodoDoc;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<TodoDoc, String> {
}
