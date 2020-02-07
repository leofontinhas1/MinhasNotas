package br.com.cna.net.teste;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TeacherFactory implements UsuarioAbstractFactory{

    private final Logger LOG = LoggerFactory.getLogger(TeacherFactory.class);

    public Usuario create(){
        LOG.info("CRIANDO UM PROFESSOR");


        return null;
    }

    @Override
    public UsuarioType getType() {
        return UsuarioType.TEACHER;
    }

}
