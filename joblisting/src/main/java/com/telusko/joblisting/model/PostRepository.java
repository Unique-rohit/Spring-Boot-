package com.telusko.joblisting.model;



import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String>{

	List<Post> findAll();

}
