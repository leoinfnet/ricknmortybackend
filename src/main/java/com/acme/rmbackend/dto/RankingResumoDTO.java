package com.acme.rmbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter@Setter@AllArgsConstructor
public class RankingResumoDTO {
    private LocalDate dia;
    private String personagem;
    private int posicao;
}
