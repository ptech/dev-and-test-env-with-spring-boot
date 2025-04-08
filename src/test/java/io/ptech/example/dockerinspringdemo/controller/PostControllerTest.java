package io.ptech.example.dockerinspringdemo.controller;

import io.ptech.example.dockerinspringdemo.TestcontainersConfiguration;
import io.ptech.example.dockerinspringdemo.repository.PostRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.assertj.core.api.Assertions.assertThat;

@Import(TestcontainersConfiguration.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class PostControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private PostRepository postRepository;

    @Test
    void shouldCreateNewPost() throws Exception {
        assertThat(postRepository.count()).isEqualTo(0);

        mockMvc.perform(MockMvcRequestBuilders
                        .post("/posts")
                        .contentType("text/plain")
                        .content("Test post content")
                )
                .andExpect(MockMvcResultMatchers.status().isOk());

        assertThat(postRepository.count()).isEqualTo(1);
    }
}
