package com.example.pokemonapi.controller;

import com.example.pokemonapi.entity.Pokemon;
import com.example.pokemonapi.service.PokemonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author maykon-oliveira
 * @since 6/25/21 3:51 PM
 */
@RestController
@AllArgsConstructor
@RequestMapping("/pokemons")
public class PokemonController {
    private final PokemonService pokemonService;

    @GetMapping("{name}")
    public List<String> findAll(@PathVariable String name) {
        return pokemonService.findAll(name);
    }
}
