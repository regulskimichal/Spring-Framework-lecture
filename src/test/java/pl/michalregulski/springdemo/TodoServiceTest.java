package pl.michalregulski.springdemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TodoServiceTest {

    private final TodoRepository todoRepository = Mockito.spy(new TodoRepository());
    private final TodoService todoService = new TodoService(todoRepository);

    @Test
    void markAsDone() {
        //given
        final var id = 1L;
        final var beforeTodo = new Todo(1L, "Test", false);
        Mockito.when(todoRepository.findById(Mockito.any())).thenReturn(beforeTodo);
        todoRepository.save(beforeTodo);

        //when
        final var todo = todoService.markAsDone(id);

        //then
        assertEquals(true, todo.done);
    }

    @Test
    void shouldThrowExceptionWhenThereIsNoSuchTask() {
        //given
        final var id = 1L;

        //then
        assertThrows(EntityNotFoundException.class, new Executable() {
            //when
            @Override
            public void execute() throws Throwable {
                todoService.markAsDone(id);
            }
        });
    }

    @Test
    void shouldThrowExceptionWhenThereIsNoSuchTaskLambda() {
        //given
        final var id = 1L;

        //when/then
        assertThrows(EntityNotFoundException.class, () -> todoService.markAsDone(id));
    }

}
