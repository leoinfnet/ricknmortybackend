package com.acme.rmbackend.controller;

import com.acme.rmbackend.model.Personagem;
import com.acme.rmbackend.service.CharacterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/api/characters")
@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")  // Liberando CORS para todos os métodos deste controlador
public class CharacterController {
    private final CharacterService characterService;

    // Criar ou atualizar um personagem
    @PostMapping
    public ResponseEntity<Personagem> createOrUpdateCharacter(@RequestBody Personagem character) {
        Personagem savedPersonagem = characterService.saveCharacter(character);
        return new ResponseEntity<>(savedPersonagem, HttpStatus.CREATED);
    }

    // Buscar todos os personagens
    @GetMapping
    public List<Personagem> getAllCharacters() {
        return characterService.getAllCharacters();
    }

    // Buscar personagem por ID
    @GetMapping("/{id}")
    public ResponseEntity<Personagem> getCharacterById(@PathVariable Long id) {
        Optional<Personagem> personagem = characterService.getCharacterById(id);
        return personagem.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    // Atualizar personagem por ID
    @PutMapping("/{id}")
    public ResponseEntity<Personagem> updateCharacter(@PathVariable Long id, @RequestBody Personagem character) {
        try {
            Personagem updatedPersonagem = characterService.updateCharacter(id, character);
            return ResponseEntity.ok(updatedPersonagem);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
    // Deletar personagem por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCharacter(@PathVariable Long id) {
        try {
            characterService.deleteCharacter(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
