package pl.michalregulski.springdemo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepository {

    private final List<Todo> todos = new ArrayList<>();

    public void save(Todo todo) {
        todos.add(todo);
    }

    public Todo findById(Long id) {
        return todos.stream().filter(todo -> todo.id.equals(id)).findFirst().orElse(null);
    }

    public List<Todo> findAll() {
        return todos;
    }

}
