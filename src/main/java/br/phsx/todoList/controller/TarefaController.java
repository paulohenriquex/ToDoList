package br.phsx.todoList.controller;

import br.phsx.todoList.entity.Tarefa;
import org.springframework.web.bind.annotation.*;
import br.phsx.todoList.service.TarefaService;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService){
        this.tarefaService = tarefaService;
    }

    @PostMapping("/")
    public Tarefa adicionarTarefa(@RequestBody Tarefa tarefa){
        return tarefaService.adicionarTarefa(tarefa);
    }

    @GetMapping("/")
    public List<Tarefa> listarTarefas(){
        return tarefaService.listarTarefas();
    }
}
