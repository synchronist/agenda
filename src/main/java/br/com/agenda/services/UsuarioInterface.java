package br.com.agenda.services;

import br.com.agenda.entity.Usuario;
import org.springframework.validation.annotation.Validated;

@Validated
public interface UsuarioInterface {
    void criarUsuario(Usuario requisicao);
}
