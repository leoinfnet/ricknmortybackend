package com.acme.rmbackend.service;


import com.acme.rmbackend.model.Personagem;
import com.acme.rmbackend.payload.CriteriaRequest;
import com.acme.rmbackend.repository.CharacterRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service@RequiredArgsConstructor
public class CharacterService {
    private final EntityManager entityManager;
    private final CharacterRepository characterRepository;
    public Personagem saveCharacter(Personagem character) {
        return characterRepository.save(character);
    }

    public List<Personagem> getAllCharacters(int page, int size){
        return characterRepository.findAll(PageRequest.of(page, size)).stream().toList();
    }
    public long count(){
        return characterRepository.count();
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
    public List<Personagem> search(CriteriaRequest criteriaRequest){

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Personagem> cq = cb.createQuery(Personagem.class);
        Root<Personagem> personagem = cq.from(Personagem.class);
        List<Predicate> predicates = new ArrayList<>();

        if(criteriaRequest.getNome().isPresent()){
            predicates.add(cb.like(personagem.get("name"), "%"+criteriaRequest.getNome().get()+"%"));
        }
        if(criteriaRequest.getOrigin().isPresent()){
            predicates.add(cb.like(personagem.get("origin"), "%"+criteriaRequest.getOrigin().get()+"%"));
        }
        if(criteriaRequest.getStatus().isPresent()){
            predicates.add(cb.like(personagem.get("status"), "%"+criteriaRequest.getStatus().get()+"%"));
        }
        cq.where(predicates.toArray(Predicate[]::new));

        return entityManager.createQuery(cq).getResultList();

    }
    public List<Personagem> getAll(){
        return characterRepository.findAll();
    }
}

