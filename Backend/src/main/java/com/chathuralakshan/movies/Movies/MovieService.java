package com.chathuralakshan.movies.Movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {



    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll ();
    }

    //optional cause it can be null
    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMoviesByImdbId(imdbId);
    }
}
