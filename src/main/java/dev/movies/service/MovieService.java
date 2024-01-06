package dev.movies.service;

import dev.movies.model.Movie;
import dev.movies.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class MovieService {

    private final  MovieRepository movieRepository;

    public List<Movie> allMovies() {

    return movieRepository.findAll();
    }

    public Optional<Movie> movieByImdbId(String imdbId) {
        return movieRepository.findByImdbId(imdbId);
    }





}
