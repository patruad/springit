package com.example.springit.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springit.domain.Link;

public interface LinkRepository extends JpaRepository<Link, Long> {

}
