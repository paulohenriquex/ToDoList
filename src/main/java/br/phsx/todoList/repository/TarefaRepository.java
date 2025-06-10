package br.phsx.todoList.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.phsx.todoList.entity.Tarefa;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa,Long> {
}
