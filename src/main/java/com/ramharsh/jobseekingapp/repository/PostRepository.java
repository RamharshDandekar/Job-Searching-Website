package com.ramharsh.jobseekingapp.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.ramharsh.jobseekingapp.modal.Post;

public interface PostRepository extends MongoRepository<Post,String>
{

}