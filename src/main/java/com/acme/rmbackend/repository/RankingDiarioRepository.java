package com.acme.rmbackend.repository;

import com.acme.rmbackend.dto.RankingResumoDTO;
import com.acme.rmbackend.model.RankingDiario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface RankingDiarioRepository extends JpaRepository<RankingDiario,Long> {
    @Query("""
        SELECT new com.acme.rmbackend.dto.RankingResumoDTO(
            r.dia, p.name, r.posicao
        )
        FROM RankingDiario r
        JOIN r.personagem p
        WHERE r.dia = :dia
        ORDER BY r.posicao ASC
        LIMIT 10
    """)
    List<RankingResumoDTO> findTop10ByDiaOrderByPosicaoAsc(LocalDate dia);

}
