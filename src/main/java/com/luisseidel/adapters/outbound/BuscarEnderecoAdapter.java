package com.luisseidel.adapters.outbound;

import com.luisseidel.adapters.outbound.rest.BuscarEnderecoRest;
import com.luisseidel.application.core.domain.Endereco;
import com.luisseidel.application.ports.out.BuscarEnderecoPortOut;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class BuscarEnderecoAdapter implements BuscarEnderecoPortOut {

    @Inject
    @RestClient
    BuscarEnderecoRest buscarEnderecoRest;

    @Override
    public Endereco buscar(String cep) {
        return buscarEnderecoRest.buscar(cep);
    }
}
