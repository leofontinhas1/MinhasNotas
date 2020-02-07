package br.com.cna.net.teste;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UsuarioRepository {

    private final Logger LOG = LoggerFactory.getLogger(UsuarioRepository.class);

    public void save(Usuario type){
        LOG.info("SALVEIIIIIIIIIIII");
    }

}
