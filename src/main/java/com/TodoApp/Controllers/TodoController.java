package com.TodoApp.Controllers;

import com.TodoApp.Models.Todo;
import com.TodoApp.Services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

       @Autowired
       private TodoService todoService;

        @GetMapping("/hello")
        public String hello(){
            return "Hellow Abhi! How r u?";
        }

        @GetMapping("/allTodos")
        public List<Todo> getAllTodos(){
            return todoService.getAllTodos();
        }

        @GetMapping("/todo/{id}")
        public Todo getTodoById(@PathVariable int id){
            return todoService.getTodoById(id);
        }

        @PostMapping("/createTodo")
        public Todo createTodo(@RequestBody Todo todo){
            return todoService.createTodo(todo);
        }

        @DeleteMapping("/deleteTodo/{id}")
        public String delById(@PathVariable int id){
            todoService.delTodoById(id);
            return "Delete successful";
        }
}
