package com.luisseidel.application.core.service;

import com.luisseidel.application.core.domain.Endereco;
import com.luisseidel.application.ports.in.BuscarEnderecoPortIn;
import com.luisseidel.application.ports.out.BuscarEnderecoPortOut;

public class BuscarEnderecoService implements BuscarEnderecoPortIn {

    private final BuscarEnderecoPortOut buscarEnderecoPortOut;

    public BuscarEnderecoService(BuscarEnderecoPortOut buscarEnderecoPortOut) {
        this.buscarEnderecoPortOut = buscarEnderecoPortOut;
    }

    @Override
    public Endereco buscarEndereco(String cep) {
        return buscarEnderecoPortOut.buscar(cep);
    }
}
