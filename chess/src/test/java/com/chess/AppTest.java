package com.chess;

import com.chess.entities.ChessPiece;
import com.chess.entities.Color;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    // won't work once ChessPiece becomes abstract
    @Test
    void testInit() {
        String message = "";
        try {
            new ChessPiece(0, 9, Color.WHITE);
        } catch (IllegalArgumentException e) {
            message = e.getMessage();
        }
        assertEquals("Out of bounds, positionX cannot be under 1 or above 8.", message);
    }
}
