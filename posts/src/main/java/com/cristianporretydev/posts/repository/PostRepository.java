package com.cristianporretydev.posts.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristianporretydev.posts.model.entity.Post;

public interface PostRepository extends JpaRepository<Post, UUID> {
    
}
