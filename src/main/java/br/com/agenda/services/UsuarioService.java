package br.com.agenda.services;


import br.com.agenda.entity.Usuario;
import br.com.agenda.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements UsuarioInterface{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void criarUsuario(Usuario requisicao) {
        usuarioRepository.save(requisicao);
    }
}
