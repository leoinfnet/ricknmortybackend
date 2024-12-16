package com.acme.rmbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data@AllArgsConstructor@NoArgsConstructor@Builder
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)  // E-mail único
    private String email;
    private String nome;
    private String cargo;
    private String avatar; // URL ou caminho para o avatar do usuário
    private String password;
}
