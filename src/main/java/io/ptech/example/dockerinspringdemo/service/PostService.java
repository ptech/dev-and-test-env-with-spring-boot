package io.ptech.example.dockerinspringdemo.service;

import io.ptech.example.dockerinspringdemo.model.Post;
import io.ptech.example.dockerinspringdemo.repository.PostRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public Post create(String content) {
        Post post = Post.builder().content(content).build();
        return postRepository.save(post);
    }

    public List<Post> findAll() {
        return postRepository.findAll();
    }

}
