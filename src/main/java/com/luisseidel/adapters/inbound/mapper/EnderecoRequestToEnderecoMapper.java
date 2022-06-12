package com.luisseidel.adapters.inbound.mapper;

import com.luisseidel.adapters.inbound.request.EnderecoRequest;
import com.luisseidel.application.core.domain.Endereco;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface EnderecoRequestToEnderecoMapper {
    Endereco mapper(EnderecoRequest enderecoRequest);
}
