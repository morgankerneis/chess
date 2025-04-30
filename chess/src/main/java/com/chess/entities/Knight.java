package com.chess.entities;

public class Knight extends ChessPiece {
    public Knight(int positionX, int positionY, Color color) {
        super(positionX, positionY, color);
    }

    public boolean canMoveTo(int positionX, int positionY) {
        // Ensuring piece doesn't move out of allowed range
        if (positionX < 1 || positionX > 8 || positionY < 1 || positionY > 8) {
            return false;
        }

        int xOffset = Math.abs(this.getPositionX() - positionX);
        int yOffset = Math.abs(this.getPositionY() - positionY);

        return (xOffset == 2 && yOffset == 1) || (yOffset == 2 && xOffset == 1);
    }
}
