package com.acme.rmbackend.controller;

import com.acme.rmbackend.payload.TypePayload;
import com.acme.rmbackend.service.TypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/api/types")
@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class TypeController {
    private final TypeService typeService;
    @GetMapping
    public ResponseEntity<?> getAllTypes(@RequestHeader(name = "type" , defaultValue = "") String criteria) {
        List<TypePayload> filter;
        if(criteria == null || criteria.isEmpty()) {
            filter = typeService.getAll();
        }else {
            filter = typeService.filter(criteria);
        }
        if(filter.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(filter);
    }
}
