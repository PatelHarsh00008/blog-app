package com.harsh.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsh.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
