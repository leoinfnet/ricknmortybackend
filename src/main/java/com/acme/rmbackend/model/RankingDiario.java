package com.acme.rmbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter@Setter@AllArgsConstructor@NoArgsConstructor
@Entity
@Table(
        name = "rankings_diarios",
        uniqueConstraints = @UniqueConstraint(name = "uk_ranking_dia_personagem", columnNames = {"dia", "personagem_id"})
)
public class RankingDiario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // agora é Long auto-generated

    @Column(nullable = false)
    private LocalDate dia;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "personagem_id", nullable = false, foreignKey = @ForeignKey(name = "fk_ranking_personagem"))
    private Personagem personagem;

    @Column(nullable = false)
    private int kills;

    @Column(nullable = false)
    private int posicao; // 1 = top do dia

}