package com.acme.rmbackend.controller;


import com.acme.rmbackend.dto.AuthUserDTO;
import com.acme.rmbackend.exception.AuthenticationException;
import com.acme.rmbackend.model.Usuario;
import com.acme.rmbackend.payload.AuthPayload;
import com.acme.rmbackend.service.SecurityService;
import com.acme.rmbackend.service.TokenService;
import com.acme.rmbackend.service.UsuarioService;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.SignatureException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
@CrossOrigin(origins = "*",allowedHeaders = "*",exposedHeaders = "*")
public class UsuarioController {
    private final UsuarioService usuarioService;
    private final SecurityService securityService;
    private final TokenService tokenService;
    @GetMapping
    public ResponseEntity<List<Usuario>> getAllUsuario() {
        return ResponseEntity.ok(usuarioService.findAll());
    }
    @PostMapping("/login")
    public ResponseEntity<?> autenticate(@RequestBody AuthUserDTO authUserDTO){
        try{
            String authenticate = securityService.authenticate(authUserDTO);
            return ResponseEntity.ok(new AuthPayload(authenticate));
        }catch (AuthenticationException ex){
            return ResponseEntity.status(HttpStatus.FORBIDDEN)
                    .body(Map.of("message", "Usuario ou senha invalidos"));
        }
    }
    @GetMapping("/{email}")
    public ResponseEntity<Usuario> getUsuarioByEmail(@PathVariable String email) {
        Optional<Usuario> byEmail = usuarioService.findByEmail(email);
        return byEmail.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    @GetMapping("/my-profile")
    public ResponseEntity<?> getMyProfile(
            @RequestHeader(value = "authorization", required = true) String token) {
        try{
            String usuario = tokenService.getUsuario(tokenService.isValid(token));
            Optional<Usuario> byId = usuarioService.findById(Long.valueOf(usuario));
            return byId.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
        }catch (SignatureVerificationException ex){
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(Map.of("message", "Not Autorized"));
        }

    }
}
