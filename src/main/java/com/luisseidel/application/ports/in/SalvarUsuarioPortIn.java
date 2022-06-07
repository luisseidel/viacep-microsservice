package com.luisseidel.application.ports.in;

import com.luisseidel.application.core.domain.Usuario;

public interface SalvarUsuarioPortIn {
    Usuario salvarUsuario(Usuario usuario, String cep);
}
