package dev.movies.controller;

import dev.movies.model.Movie;
import dev.movies.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:3000"})
public class MovieController {

    private final MovieService moviesService;
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
    return new ResponseEntity<List<Movie>>(moviesService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getMovieByImdbId(@PathVariable String imdbId) {
        return new ResponseEntity<Optional<Movie>>(moviesService.movieByImdbId(imdbId), HttpStatus.OK);
    }

}
