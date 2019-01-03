package com.example.springit.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springit.domain.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long> {

}
