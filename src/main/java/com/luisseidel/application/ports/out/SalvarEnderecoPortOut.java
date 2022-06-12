package com.luisseidel.application.ports.out;

import com.luisseidel.application.core.domain.Endereco;

public interface SalvarEnderecoPortOut {
    Endereco salvarEndereco(Endereco endereco);
}
