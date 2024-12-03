package com.acme.rmbackend.controller;

import com.acme.rmbackend.model.Personagem;
import com.acme.rmbackend.service.CharacterService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/api/characters")
@RestController@Slf4j
@RequiredArgsConstructor
@CrossOrigin(origins = "*",allowedHeaders = "*",exposedHeaders = "*")  // Liberando CORS para todos os métodos deste controlador
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
    public ResponseEntity<?> getAllCharacters(@RequestHeader(value = "page", defaultValue = "0") String page, @RequestHeader(value = "size", defaultValue = "10") String size) {
        log.info("page: " + page + " size: " + size);
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Total-Count", String.valueOf(characterService.count()));
        List<Personagem> allCharacters = characterService.getAllCharacters(Integer.parseInt(page), Integer.parseInt(size));
        return new ResponseEntity<>(allCharacters, headers, HttpStatus.OK);

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
