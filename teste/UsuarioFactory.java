package br.com.cna.net.teste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsuarioFactory {

    @Autowired
    private List<UsuarioAbstractFactory> factoryList;

    public UsuarioAbstractFactory of(String type){
        UsuarioAbstractFactory factory = factoryList.stream()
                .filter(factoryList -> factoryList.getType().name().equalsIgnoreCase(type))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("nao encontrei esse tipo de usuario no sistema"));
        return factory;
    }

}
