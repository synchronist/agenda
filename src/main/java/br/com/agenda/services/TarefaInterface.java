package br.com.agenda.services;

import br.com.agenda.entity.Tarefa;
import org.springframework.validation.annotation.Validated;

@Validated
public interface TarefaInterface {
    void criarTarefa(Tarefa requisicao);
}
