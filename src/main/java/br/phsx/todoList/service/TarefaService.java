package br.phsx.todoList.service;

import br.phsx.todoList.entity.Tarefa;
import org.springframework.stereotype.Service;
import br.phsx.todoList.repository.TarefaRepository;

import java.util.List;

@Service
public class TarefaService {
    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository){
        this.tarefaRepository = tarefaRepository;
    }

    public Tarefa adicionarTarefa(Tarefa tarefa){
        return tarefaRepository.save(tarefa);
    }

    public List<Tarefa> listarTarefas(){
        return tarefaRepository.findAll();
    }

}
