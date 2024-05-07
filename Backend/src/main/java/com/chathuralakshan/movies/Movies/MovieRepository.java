package com.chathuralakshan.movies.Movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

    //these are dynamic automatic queries
    Optional<Movie> findMoviesByImdbId(String imdbId);
}
