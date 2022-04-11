package br.com.agenda.controller;

import br.com.agenda.entity.Usuario;
import br.com.agenda.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/tarefas")
@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService tarefaService;

    @PostMapping(value = "criar")
    public void criarTarefa(@RequestBody Usuario requisicao)
    {
        tarefaService.criarUsuario(requisicao);
    }

}
