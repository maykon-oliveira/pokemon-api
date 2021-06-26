package com.example.pokemonapi.service;

import com.example.pokemonapi.entity.Pokemon;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author maykon-oliveira
 * @since 6/25/21 3:49 PM
 */
@Service
public class PokemonService {
  private final List<Pokemon> pokemons =
      Arrays.asList(
          Pokemon.from("ditto", "limber", "imposter"),
          Pokemon.from("bulbasaur", "overgrow", "chlorophyll"),
          Pokemon.from("squirtle", "torrent", "rain-dish"),
          Pokemon.from("butterfree", "compound-eyes", "tinted-lens"));

  public List<String> findAll(String name) {
    return pokemons.stream()
        .filter(it -> it.getName().equals(name))
        .map(Pokemon::getAbility)
        .flatMap(Stream::of)
        .sorted()
        .collect(Collectors.toList());
  }
}
