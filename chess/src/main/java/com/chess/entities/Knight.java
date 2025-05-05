package com.chess.entities;

public class Knight extends ChessPiece {
    public Knight(int positionX, int positionY, Color color) {
        super(positionX, positionY, color);
    }

    @Override
    public boolean canMoveTo(int positionX, int positionY) {
        // Ensuring piece doesn't move out of allowed range
        if (!isOnChessboard(positionX, positionY)) {
            return false;
        }

        int xOffset = Math.abs(this.getPositionX() - positionX);
        int yOffset = Math.abs(this.getPositionY() - positionY);

        return (xOffset == 2 && yOffset == 1) || (yOffset == 2 && xOffset == 1);
    }

}
