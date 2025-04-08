package io.ptech.example.dockerinspringdemo.controller;

import io.ptech.example.dockerinspringdemo.model.Post;
import io.ptech.example.dockerinspringdemo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping
    public Post create(@RequestBody String content) {
        return postService.create(content);
    }

    @GetMapping
    public List<Post> findAdd() {
        return postService.findAll();
    }

}
