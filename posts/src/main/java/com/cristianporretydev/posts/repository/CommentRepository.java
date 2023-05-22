package com.cristianporretydev.posts.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristianporretydev.posts.model.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, UUID> {
    
}
