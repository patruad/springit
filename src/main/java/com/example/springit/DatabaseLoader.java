package com.example.springit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.springit.domain.Comment;
import com.example.springit.domain.Link;
import com.example.springit.respository.CommentRepository;
import com.example.springit.respository.LinkRepository;

@Component
public class DatabaseLoader implements CommandLineRunner {

	@Autowired
	private LinkRepository linkRepository;
	
	@Autowired
	private CommentRepository commentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Database work!");
		Link link = new Link("Getting Started with Spring Boot 2", "http://link.com");
		linkRepository.save(link);
		
		Comment comment = new Comment("Ce curs grozav!", link);
		commentRepository.save(comment);
	}

}
