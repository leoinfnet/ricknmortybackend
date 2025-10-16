package com.acme.rmbackend.service;

import com.acme.rmbackend.dto.RankingResumoDTO;
import com.acme.rmbackend.model.RankingDiario;
import com.acme.rmbackend.repository.RankingDiarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service@RequiredArgsConstructor
public class RankingService {
    private final RankingDiarioRepository rankingDiarioRepository;
    public List<RankingResumoDTO> findTop10ByDiaOrderByPosicaoAsc(LocalDate dia) {
        return rankingDiarioRepository.findTop10ByDiaOrderByPosicaoAsc(dia);
    }

}
