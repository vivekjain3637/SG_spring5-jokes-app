package org.springframework.SG_spring5jokesapp.services.impl;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.SG_spring5jokesapp.services.JokeService;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl(){
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }
    @Override
    public String getJoke() {
        return this.chuckNorrisQuotes.getRandomQuote();
    }
}
