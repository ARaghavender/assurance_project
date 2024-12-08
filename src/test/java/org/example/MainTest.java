package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testMainMethod() {
        // Arrange
        String[] args = {}; // Simulate empty arguments

        // Act & Assert
        assertDoesNotThrow(() -> Main.main(args));
    }
}
