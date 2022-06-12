package com.luisseidel.adapters.inbound.mapper;

import com.luisseidel.adapters.inbound.entity.EnderecoEntity;
import com.luisseidel.application.core.domain.Endereco;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface EnderecoEntityToEnderecoMapper {
    Endereco mapper(EnderecoEntity endereco);
}
