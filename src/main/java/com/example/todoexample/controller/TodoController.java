package com.example.todoexample.controller;

import com.example.todoexample.service.TodoService;
import com.example.todoexample.store.TodoDoc;
import com.example.todoexample.store.domain.Todo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/todo")
public class TodoController {

    private final TodoService todoService;

    @PostMapping("/item")
    public void createItem (@RequestBody Todo todo) {
        todoService.createItem(todo);
    }

    @GetMapping("/list")
    public List<Todo> getList (@RequestParam(value = "page", defaultValue = "0") int page,
                               @RequestParam(value = "limit", defaultValue = "0") int limit) {
        if(limit != 0) {
            return todoService.getList(page, limit);
        }else{
            return todoService.getList();
        }
    }

    @PutMapping("/item")
    public void updateItem (@RequestBody Todo todo) {
        todoService.updateItem(todo);
    }

    @DeleteMapping("/item")
    public void deleteItem (@RequestBody Todo todo) {
        todoService.deleteItem(todo);
    }

}
