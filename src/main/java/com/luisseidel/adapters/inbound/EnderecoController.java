package com.luisseidel.adapters.inbound;

import com.luisseidel.adapters.inbound.request.EnderecoRequest;
import com.luisseidel.application.core.domain.Endereco;
import com.luisseidel.application.core.service.BuscarEnderecoService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/endereco")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EnderecoController {

    @Inject
    private BuscarEnderecoService buscarEnderecoService;

    @POST
    public Endereco buscarEndereco(EnderecoRequest enderecoRequest) {
        return buscarEnderecoService.buscar(enderecoRequest.getCep());
    }
}
