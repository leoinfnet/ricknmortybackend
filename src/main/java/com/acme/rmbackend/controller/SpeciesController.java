package com.acme.rmbackend.controller;

import com.acme.rmbackend.payload.LocationPayload;
import com.acme.rmbackend.payload.SpeciePayload;
import com.acme.rmbackend.service.SpeciesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/species")
@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class SpeciesController {
    private final SpeciesService speciesService;
    @GetMapping
    public ResponseEntity<List<SpeciePayload>> getSpecies() {
        List<SpeciePayload> species =
                speciesService.getSpecies();
        return ResponseEntity.ok(species);
    }
}
