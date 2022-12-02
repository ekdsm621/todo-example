package com.example.todoexample.controller;

import com.example.todoexample.service.TodoService;
import com.example.todoexample.store.TodoDoc;
import com.example.todoexample.store.domain.Todo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
// FIXME: Spring DI의 대표적인 두가지 방식 관점에서 @RequiredArgsConstructor의 의미와 @Autowired의 의미를 잘 파악해보세요.
@RequiredArgsConstructor
// FIXME: controller 가 여러 개로 늘어난다면...?
@RequestMapping("/api")
// FIXME: controller 가 여러 개로 늘어난다면...?
@CrossOrigin(origins="*")
public class TodoController {

    @Autowired
    private final TodoService todoService;

    // FIXME : Todo와 TodoDoC 각각의 의미를 다시 한번 생각해보세요.

    @PostMapping("/item")
    public void createItem (@RequestBody TodoDoc todoDoc) {
        todoService.createItem(todoDoc);
    }

    // FIXME : Infinite Scroll을 적용해볼 수 있도록 API 를 재설계 해보세요.
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
