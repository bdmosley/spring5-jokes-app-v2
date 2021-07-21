package guru.springframework.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeServiceImpl implements JokeService {
    ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

    @Override
    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
