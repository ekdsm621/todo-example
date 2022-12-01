package com.example.todoexample.controller;

import com.example.todoexample.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class TodoController {

    @Autowired
    private final TodoService todoService;




}
