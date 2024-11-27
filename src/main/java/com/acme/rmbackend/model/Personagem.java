package com.acme.rmbackend.model;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor@Builder
@Entity
@Table(name = "CHARACTERS")
public class Personagem implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // ID do personagem (chave primária)

    @Column(name = "name", nullable = false)
    private String name;  // Nome do personagem

    @Column(name = "status")
    private String status;  // Status (ex: Alive, Dead)

    @Column(name = "species")
    private String species;  // Espécie

    @Column(name = "type")
    private String type;  // Tipo (caso exista um tipo, senão pode ser vazio)

    @Column(name = "gender")
    private String gender;  // Gênero

    @Column(name = "origin")
    private String origin;  // Nome da origem

    @Column(name = "location")
    private String location;  // Nome da localização

    @Column(name = "image")
    private String image;  // URL da imagem do personagem

    @Column(name = "episode_count")
    private Integer episodeCount;  // Número de episódios em que o personagem aparece
}
