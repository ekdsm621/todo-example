package com.example.todoexample.service;

import com.example.todoexample.store.TodoDoc;
import com.example.todoexample.store.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public void createItem(TodoDoc todoDoc) {
        todoRepository.save(todoDoc);
    }

    public List<TodoDoc> getList () {
        return todoRepository.findAll();
    }

    public void updateItem(TodoDoc todoDoc) {
        todoRepository.save(todoDoc);
    }

    public void deleteItem(String id) {
        todoRepository.deleteById(id);
    }

}
