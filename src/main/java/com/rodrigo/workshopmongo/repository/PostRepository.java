package com.rodrigo.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.rodrigo.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

        @Query("{ 'title': { $regex: ?0, $options: 'i' } }")
        List <Post> searchTitle(String text);

            //Query methods
        List<Post> findByTitleContainingIgnoreCase(String text); 

}
