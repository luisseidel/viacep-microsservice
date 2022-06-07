package com.luisseidel.application.ports.out;

import com.luisseidel.application.core.domain.Usuario;

public interface SalvarUsuarioPortOut {
    Usuario salvarUsuario(Usuario usuario);
}
