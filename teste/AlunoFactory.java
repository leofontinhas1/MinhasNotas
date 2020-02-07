package br.com.cna.net.teste;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class AlunoFactory implements UsuarioAbstractFactory{

    private final Logger LOG = LoggerFactory.getLogger(AlunoFactory.class);

    @Override
    public Usuario create() {
        LOG.info("CRIANDO UM ALUNO");
        return null;
    }

    @Override
    public UsuarioType getType() {
        return UsuarioType.STUDENT;
    }

}
