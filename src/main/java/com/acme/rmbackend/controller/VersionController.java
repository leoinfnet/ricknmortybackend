package com.acme.rmbackend.controller;

import com.acme.rmbackend.payload.VersionPayload;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/version")
@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")  // Liberando CORS para todos os métodos deste controlador
public class VersionController {
    @GetMapping
    public VersionPayload getVersion() {
        return new VersionPayload("1.5");
    }
}
