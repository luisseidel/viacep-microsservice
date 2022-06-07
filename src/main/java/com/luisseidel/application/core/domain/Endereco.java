package com.luisseidel.application.core.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Endereco {

    private Long codigoIbge;
    private String uf;
    private String cep;
    private String cidade;
    private String bairro;
    private String logradouro;

}
