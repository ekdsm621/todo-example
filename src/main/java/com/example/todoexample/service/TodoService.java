package com.example.todoexample.service;

import com.example.todoexample.store.TodoDoc;
import com.example.todoexample.store.domain.Todo;
import com.example.todoexample.store.repository.TodoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    private final ModelMapper modelMapper = new ModelMapper();

    public void createItem(Todo todo) {
        TodoDoc todoDoc = modelMapper.map(todo, TodoDoc.class);
        todoRepository.save(todoDoc);
    }

    public List<Todo> getList () {
        List<TodoDoc> todoList = todoRepository.findAll();
        return todoList.stream().map(item -> modelMapper.map(item, Todo.class)).collect(Collectors.toList());
    }

    public List<Todo> getList(int page, int limit) {
        Page<TodoDoc> todoPage = todoRepository.findAll(PageRequest.of(page, limit));
        return todoPage.stream().map(item -> modelMapper.map(item, Todo.class)).collect(Collectors.toList());
    }

    public void updateItem(Todo todo) {
        TodoDoc todoDoc = modelMapper.map(todo, TodoDoc.class);
        todoRepository.save(todoDoc);
    }

    public void deleteItem(Todo todo) {
        TodoDoc todoDoc = modelMapper.map(todo, TodoDoc.class);
        todoRepository.delete(todoDoc);
    }

}
