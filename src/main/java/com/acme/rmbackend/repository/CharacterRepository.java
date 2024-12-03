package com.acme.rmbackend.repository;

import com.acme.rmbackend.model.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<Personagem, Long> {
}
