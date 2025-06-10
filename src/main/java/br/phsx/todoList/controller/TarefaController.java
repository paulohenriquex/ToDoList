package br.phsx.todoList.controller;

import br.phsx.todoList.entity.Tarefa;
import br.phsx.todoList.service.TarefaService;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import br.phsx.todoList.dto.TarefaDTO;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService){
        this.tarefaService = tarefaService;
    }

    @PostMapping("/")
    public ResponseEntity<Tarefa> criarTarefa(@Valid @RequestBody TarefaDTO tarefaDTO){
        Tarefa novaTarefa = new Tarefa();
        novaTarefa.setDescricao(tarefaDTO.getDescricao());
        novaTarefa.setDataPrazo(tarefaDTO.getDataPrazo());
        Tarefa tarefaSalva = tarefaService.adicionarTarefa(novaTarefa);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaTarefa);
    }

    @GetMapping("/")
    public List<Tarefa> listarTarefas(){
        return tarefaService.listarTarefas();
    }
}
