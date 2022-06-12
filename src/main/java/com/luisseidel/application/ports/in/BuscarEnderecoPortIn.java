package com.luisseidel.application.ports.in;

import com.luisseidel.application.core.domain.Endereco;

public interface BuscarEnderecoPortIn {
    Endereco buscar(String cep);
}
