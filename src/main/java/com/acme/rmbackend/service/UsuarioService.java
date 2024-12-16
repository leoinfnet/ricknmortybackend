package com.acme.rmbackend.service;


import com.acme.rmbackend.model.Usuario;
import com.acme.rmbackend.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    public Optional<Usuario> findByEmail(String email) {
        Usuario byEmail = usuarioRepository.findByEmail(email);
        if (byEmail == null) {return Optional.empty(); }
        else { return Optional.of(byEmail); }
    }
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> findById(Long id) {
        Optional<Usuario> byId = usuarioRepository.findById(id);
        if(byId.isPresent()){
            Usuario usuario = byId.get();
            usuario.setPassword(null);
            return Optional.of(usuario);
        }
        return byId;
    }
}
