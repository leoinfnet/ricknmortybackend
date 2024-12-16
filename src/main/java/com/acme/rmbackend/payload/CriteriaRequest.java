package com.acme.rmbackend.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Optional;
@Builder@AllArgsConstructor@Data
public class CriteriaRequest {
    Optional<String> nome;
    Optional<String> origin;
    Optional<String> status;
}
