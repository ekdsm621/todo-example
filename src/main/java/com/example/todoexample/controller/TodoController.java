package com.example.todoexample.controller;

import com.example.todoexample.service.TodoService;
import com.example.todoexample.store.TodoDoc;
import com.example.todoexample.store.domain.Todo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class TodoController {

    @Autowired
    private final TodoService todoService;

    @PostMapping("/item")
    public void createItem (@RequestBody TodoDoc todoDoc) {
        todoService.createItem(todoDoc);
    }

    @GetMapping("/list")
    public List<TodoDoc> getList () {
        return todoService.getList();
    }

    @PutMapping("/item")
    public void updateItem (@RequestBody TodoDoc todoDoc) {
        todoService.updateItem(todoDoc);
    }

    @DeleteMapping("/item")
    public void deleteItem (@RequestBody String id) {
        todoService.deleteItem(id);
    }

}
