package br.com.cna.net.teste;

import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioFactory factory;

    public UsuarioService(UsuarioRepository usuarioRepository, UsuarioFactory factory) {
        this.usuarioRepository = usuarioRepository;
        this.factory = factory;
    }

    public void save(String type){
        UsuarioAbstractFactory typeFactory = factory.of(type);
        Usuario usuario = typeFactory.create();
        usuarioRepository.save(usuario);
    }

}
