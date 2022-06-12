package com.luisseidel.adapters.outbound;

import com.luisseidel.adapters.inbound.entity.EnderecoEntity;
import com.luisseidel.adapters.inbound.mapper.EnderecoEntityToEnderecoMapper;
import com.luisseidel.adapters.inbound.mapper.EnderecoToEnderecoEntityMapper;
import com.luisseidel.adapters.outbound.repository.EnderecoRepository;
import com.luisseidel.adapters.outbound.rest.BuscarEnderecoRest;
import com.luisseidel.application.core.domain.Endereco;
import com.luisseidel.application.ports.out.SalvarEnderecoPortOut;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;

public class SalvarEnderecoAdapter implements SalvarEnderecoPortOut {

    @Inject
    EnderecoRepository enderecoRepository;

    @Inject
    EnderecoToEnderecoEntityMapper enderecoToEnderecoEntityMapper;

    @Inject
    EnderecoEntityToEnderecoMapper enderecoEntityToEnderecoMapper;

    @Inject
    @RestClient
    BuscarEnderecoRest buscarEnderecoRest;

    @Override
    @Transactional
    public Endereco salvarEndereco(Endereco endereco) {
        Endereco endereco = enderecoRepository.persist(endereco);
        EnderecoEntity enderecoEntity = enderecoToEnderecoEntityMapper.mapper(endereco);
        Endereco e = enderecoEntityToEnderecoMapper.mapper(enderecoEntity1);

        return e;
    }
}
