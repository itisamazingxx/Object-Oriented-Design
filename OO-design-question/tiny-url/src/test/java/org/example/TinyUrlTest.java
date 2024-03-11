package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinyUrlTest {
    private String originalUrl;
    private TinyUrl tinyUrl;

    @BeforeEach
    void setUp() {
        originalUrl = "https://mermaid.js.org/syntax/classDiagram.html";
    }

    @Test
    void longToShort() {
        tinyUrl = new TinyUrl();
        tinyUrl.longToShort(originalUrl);
    }

    @Test
    void shortToLong() {
        tinyUrl = new TinyUrl();
        String longUrl = tinyUrl.shortToLong("Z2a4Em");
        assertEquals("https://mermaid.js.org/syntax/classDiagram.html", longUrl);

    }
}