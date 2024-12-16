package com.acme.rmbackend.service;


import com.acme.rmbackend.dto.AuthUserDTO;
import com.acme.rmbackend.exception.AuthenticationException;
import com.acme.rmbackend.model.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SecurityService {
    private final UsuarioService usuarioService;
    private final TokenService tokenService;
    public String authenticate(AuthUserDTO authUserDTO) throws AuthenticationException {
        Optional<Usuario> byEmail = usuarioService.findByEmail(authUserDTO.email());
        if(byEmail.isEmpty()) throw new AuthenticationException("Usuario ou senha incorretos");
        Usuario usuario = byEmail.get();
        if(usuario.getPassword().equals(authUserDTO.password())) return tokenService.generateToken(usuario);
        else throw new AuthenticationException("Usuario ou senha incorretos");
    }
}
