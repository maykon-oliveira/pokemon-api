package com.example.pokemonapi.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author maykon-oliveira
 * @since 6/25/21 3:49 PM
 */
@Getter
@Setter
@EqualsAndHashCode
public class Pokemon {
    private String name;
    private String[] ability;

    public Pokemon(String name, String... ability) {
        this.name = name;
        this.ability = ability;
    }

    public static Pokemon from(String name, String... ability) {
        return new Pokemon(name, ability);
    }
}
