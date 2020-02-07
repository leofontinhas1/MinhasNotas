package br.com.cna.net.observable;

import org.springframework.stereotype.Component;

@Component
public class QualquerCoisa implements Validate{

    @Override
    public void validate(String entity) {
        if(entity.contains("brazil")){
            throw new RuntimeException("asasassa");
        }
    }

}
