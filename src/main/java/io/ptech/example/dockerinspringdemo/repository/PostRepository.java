package io.ptech.example.dockerinspringdemo.repository;

import io.ptech.example.dockerinspringdemo.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {
}
