package com.luisseidel.application.core.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {
    private Long id;
    private String nome;
    private Endereco endereco;
}
