package com.acme.rmbackend.service;


import com.acme.rmbackend.model.Personagem;
import com.acme.rmbackend.repository.CharacterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service@RequiredArgsConstructor
public class CharacterService {
    private final CharacterRepository characterRepository;
    public Personagem saveCharacter(Personagem character) {
        return characterRepository.save(character);
    }

    public List<Personagem> getAllCharacters() {
        return characterRepository.findAll().subList(0, 50);
    }

    public Optional<Personagem> getCharacterById(Long id) {
        return characterRepository.findById(id);
    }

    public Personagem updateCharacter(Long id, Personagem character) {
        if (!characterRepository.existsById(id)) {
            throw new RuntimeException("Character not found with id " + id);
        }
        character.setId(id); // Garantir que o ID está configurado
        return characterRepository.save(character);
    }

    public void deleteCharacter(Long id) {
        if (!characterRepository.existsById(id)) {
            throw new RuntimeException("Character not found with id " + id);
        }
        characterRepository.deleteById(id);
    }
}

