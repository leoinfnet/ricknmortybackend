package com.acme.rmbackend.service;

import com.acme.rmbackend.model.Personagem;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import com.opencsv.CSVWriter;

@Service
@RequiredArgsConstructor
public class CsvService {
    private final CharacterService characterService;
    public void generate(String filepath){
        List<Personagem> all = characterService.getAll();
        try(CSVWriter writer=  new CSVWriter(new FileWriter(filepath))){
            writer.writeNext(new String[]{"ID", "NOME", "ORIGIN"});
            for(Personagem personagem : all){
                writer.writeNext(new String[]{
                        String.valueOf(personagem.getId()),
                        personagem.getName(),
                        personagem.getOrigin()
                });
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
