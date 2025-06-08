package com.TodoApp.Services;

import com.TodoApp.Models.Todo;
import com.TodoApp.Repos.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepo todoRepo;

    public List<Todo> getAllTodos(){
        return todoRepo.findAll();
    }

    public Todo createTodo(Todo todo){
        return todoRepo.save(todo);
    }


    public Todo getTodoById(int id) {
        return todoRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo not found with id " + id));
    }


    public void delTodoById(int id){
        todoRepo.deleteById(id);
    }
}

//ok