package pl.michalregulski.springdemo;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public void save(Todo todo) {
        todoRepository.save(todo);
    }

    public Todo get(Long id) {
        return todoRepository.findById(id);
    }

    public Todo markAsDone(Long id) {
        final var todo = todoRepository.findById(id);
        if (todo == null) {
            throw new EntityNotFoundException(Todo.class, id);
        }

        if (!todo.done) {
            todo.done = true;
        } else {
            throw new TodoIsAlreadyDoneException();
        }
        return todo;
    }

}
