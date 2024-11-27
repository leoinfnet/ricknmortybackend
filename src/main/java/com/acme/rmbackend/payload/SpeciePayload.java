package com.acme.rmbackend.payload;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor@Builder
public class SpeciePayload {
    private Integer id;
    private String name;
}
