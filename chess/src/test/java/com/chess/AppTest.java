package com.chess;

import com.chess.entities.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
            new Bishop(0, 9, Color.WHITE);
        } catch (IllegalArgumentException e) {
            message = e.getMessage();
        }
        assertEquals("Out of bounds, positionX cannot be under 1 or above 8.", message);
    }

    @Test
    void testIsOnChessboard() {
        ChessPiece chessPiece = new Knight(8, 1, Color.BLACK);
        boolean isOnChessboard = chessPiece.isOnChessboard(9, 1);
        assertEquals(false, isOnChessboard);
    }

    @Test
    void testCanMoveTo() {
        ChessPiece piece = new Pawn(5, 5, Color.BLACK);
        assertTrue(piece.canMoveTo(5, 6));
    }

    @Test
    void testCanEat() {
        ChessPiece piece1 = new Pawn(6, 4, Color.WHITE);
        ChessPiece piece2 = new Pawn(5, 5, Color.BLACK);

        assertTrue(piece1.canEat(piece2));
    }
}
