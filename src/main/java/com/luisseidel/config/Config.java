package com.luisseidel.config;

import com.luisseidel.application.core.service.BuscarEnderecoService;
import com.luisseidel.application.ports.out.BuscarEnderecoPortOut;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Default;

@Dependent
public class Config {

    @Default
    public BuscarEnderecoService buscarEnderecoService(BuscarEnderecoPortOut buscarEnderecoPortOut) {
        return new BuscarEnderecoService(buscarEnderecoPortOut);
    }
}
