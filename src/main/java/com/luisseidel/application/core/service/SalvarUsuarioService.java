package com.luisseidel.application.core.service;

import com.luisseidel.application.core.domain.Usuario;
import com.luisseidel.application.ports.in.SalvarUsuarioPortIn;
import com.luisseidel.application.ports.out.BuscarEnderecoPort;
import com.luisseidel.application.ports.out.SalvarUsuarioPortOut;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SalvarUsuarioService implements SalvarUsuarioPortIn {

    private final SalvarUsuarioPortOut salvarUsuarioPortOut;
    private final BuscarEnderecoPort buscarEnderecoPort;

    public SalvarUsuarioService(SalvarUsuarioPortOut salvarUsuarioPortOut, BuscarEnderecoPort buscarEnderecoPort) {
        this.salvarUsuarioPortOut = salvarUsuarioPortOut;
        this.buscarEnderecoPort = buscarEnderecoPort;
    }

    @Override
    public Usuario salvarUsuario(Usuario usuario, String cep) {
        var endereco = buscarEnderecoPort.buscar(cep);
        usuario.setEndereco(endereco);

        return salvarUsuarioPortOut.salvarUsuario(usuario);
    }
}
