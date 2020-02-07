package br.com.cna.net.observable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountValidateService {

    @Autowired
    private List<Validate> validates;

    public void validate(String entity){
        validates.forEach(validate -> validate.validate(entity));
    }

}
