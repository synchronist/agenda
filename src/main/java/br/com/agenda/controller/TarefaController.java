package br.com.agenda.controller;

import br.com.agenda.entity.Tarefa;
import br.com.agenda.services.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/tarefas")
@RestController
public class TarefaController {
    @Autowired
    private TarefaService tarefaService;

    @PostMapping(value = "criar")
    public void criarTarefa(@RequestBody Tarefa requisicao)
    {
        tarefaService.criarTarefa(requisicao);
    }

}
