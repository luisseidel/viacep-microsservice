package com.luisseidel.adapters.outbound;

import com.luisseidel.adapters.inbound.entity.EnderecoEntity;
import com.luisseidel.adapters.inbound.mapper.EnderecoEntityToEnderecoMapper;
import com.luisseidel.adapters.inbound.mapper.EnderecoToEnderecoEntityMapper;
import com.luisseidel.adapters.outbound.rest.BuscarEnderecoRest;
import com.luisseidel.application.core.domain.Endereco;
import com.luisseidel.application.ports.out.SalvarEnderecoPortOut;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
public class BuscarEnderecoAdapter implements SalvarEnderecoPortOut {

//    @Inject
//    EnderecoRepository enderecoRepository;

    @Inject
    EnderecoToEnderecoEntityMapper enderecoToEnderecoEntityMapper;

    @Inject
    EnderecoEntityToEnderecoMapper enderecoEntityToEnderecoMapper;

    @Inject
    @RestClient
    BuscarEnderecoRest buscarEnderecoRest;

    @Override
    //@Transactional
    public Endereco salvarEndereco(Endereco endereco) {
        EnderecoEntity enderecoEntity = enderecoToEnderecoEntityMapper.mapper(endereco);
        //enderecoRepository.persist(enderecoEntity);
        Endereco e = enderecoEntityToEnderecoMapper.mapper(enderecoEntity);

        return e;
    }
}
