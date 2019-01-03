package com.example.springit.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springit.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
