package com.acme.rmbackend.service;

import com.acme.rmbackend.payload.LocationPayload;
import com.acme.rmbackend.payload.SpeciePayload;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SpeciesService {
    public List<SpeciePayload> getSpecies(){ return this.species;}
    private List<SpeciePayload> species = init();
    private List<SpeciePayload> init(){
        List<SpeciePayload> species = new ArrayList<>();
        species.add(new SpeciePayload(1, "Alien"));
        species.add(new SpeciePayload(2, "Animal"));
        species.add(new SpeciePayload(3, "Cronenberg"));
        species.add(new SpeciePayload(4, "Disease"));
        species.add(new SpeciePayload(5, "Human"));
        species.add(new SpeciePayload(6, "Humanoid"));
        species.add(new SpeciePayload(7, "Mythological Creature"));
        species.add(new SpeciePayload(8, "Poopybutthole"));
        species.add(new SpeciePayload(9, "Robot"));
        species.add(new SpeciePayload(10, "unknown"));
        return species;
    }
}
