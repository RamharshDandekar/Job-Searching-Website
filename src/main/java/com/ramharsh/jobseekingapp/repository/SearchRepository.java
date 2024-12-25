package com.ramharsh.jobseekingapp.repository;

import java.util.List;

import com.ramharsh.jobseekingapp.modal.Post;

public interface SearchRepository {

    List<Post> findByText(String text);

}