package todolist.example.todo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import todolist.example.todo.todoModel.Todo;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
