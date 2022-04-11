package br.com.agenda.services;

import br.com.agenda.entity.Tarefa;
import br.com.agenda.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarefaService implements TarefaInterface{

    @Autowired
    private TarefaRepository tarefaRepository;

    @Override
    public void criarTarefa(Tarefa requisicao) {
        tarefaRepository.save(requisicao);
    }
}
