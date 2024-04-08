package com.chathuralakshan.movies.Movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies") //to tell that this class represent each document
@Data //annotation for getters setters
@AllArgsConstructor //constructor takes all fields as parameter
@NoArgsConstructor
public class Movie {
    @Id //to tell that id is unique
    private ObjectId id;
    private String imdbID;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference //referencing by ID without embedding the docs relationship
    private List<Review> reviewIds;
}
