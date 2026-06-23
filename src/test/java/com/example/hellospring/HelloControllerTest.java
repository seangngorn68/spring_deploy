package com.example.hellospring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(HelloController.class)
class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void helloShouldReturnMessage() throws Exception {
        mockMvc.perform(get("/api/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, World!  Jenkins 123  auto refresh"));
    }

    @Test
    void greetShouldReturnDefaultGuest() throws Exception {
        mockMvc.perform(get("/api/greet"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, Guest! Welcome to Spring Boot.Auto Deploy Jenkins auto refresh"));
    }

    @Test
    void greetShouldReturnCustomName() throws Exception {
        mockMvc.perform(get("/api/greet?name=Sean"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, Sean! Welcome to Spring Boot.Auto Deploy Jenkins auto refresh"));
    }

    @Test
    void messageShouldReturnMessage() throws Exception {
        mockMvc.perform(get("/api/message"))
                .andExpect(status().isOk())
                .andExpect(content().string("This is a simple Spring Boot REST API returning a String.Auto Deploy Jenkins"));
    }
}
