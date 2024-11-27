package com.acme.rmbackend.repository;

import com.acme.rmbackend.model.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Personagem, Long> {
}
