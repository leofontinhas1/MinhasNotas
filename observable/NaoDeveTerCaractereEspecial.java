package br.com.cna.net.observable;

import org.springframework.stereotype.Component;

@Component
public class NaoDeveTerCaractereEspecial implements Validate{


    @Override
    public void validate(String entity) {
        if(entity.contains("?")){
            throw new RuntimeException("NAO PASSO");
        }
    }
}
