package com.acme.rmbackend.controller;

import com.acme.rmbackend.dto.RankingResumoDTO;
import com.acme.rmbackend.model.RankingDiario;
import com.acme.rmbackend.service.RankingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/ranking")
@RequiredArgsConstructor
public class RankingController {
    private final RankingService rankingService;
    @GetMapping
    public Map<LocalDate, List<Map<String, Integer>>>buscarRanking(@RequestParam(required = false) LocalDate dia) {
        LocalDate dataConsulta = (dia != null) ? dia : LocalDate.now().minusDays(10);
        List<RankingResumoDTO> registros = rankingService.findTop10ByDiaOrderByPosicaoAsc(dataConsulta);

        return registros.stream()
                .collect(Collectors.groupingBy(
                        RankingResumoDTO::getDia,
                        LinkedHashMap::new,
                        Collectors.mapping(
                                r -> Map.of(r.getPersonagem(), r.getPosicao()),
                                Collectors.toList()
                        )
                ));
    }
}
