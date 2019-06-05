package com.portugal.mongodb.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portugal.mongodb.Services.exception.ObjectNotFoundException;
import com.portugal.mongodb.domain.Post;
import com.portugal.mongodb.repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Post not found"));
	}
	
	
}
