package com.chess.entities;

public class Pawn extends ChessPiece {
    public Pawn(int positionX, int positionY, Color color) {
        super(positionX, positionY, color);
    }

    @Override
    public boolean canMoveTo(int positionX, int positionY) {
        // Ensuring piece doesn't move out of allowed range
        if (!isOnChessboard(positionX, positionY)) {
            return false;
        }

        // No absolute value here because the pawn can't go backwards.
        int xOffset = this.getPositionX() - positionX;
        int yOffset = this.getPositionY() - positionY;

        return xOffset == 0 && yOffset == -1;
    }

    @Override
    public boolean canEat(ChessPiece piece) {
        int xOffset = Math.abs(this.getPositionX() - piece.getPositionX());
        int yOffset = this.getPositionY() - piece.getPositionY();

        return xOffset == 1 && yOffset == -1 && this.getColor() != piece.getColor();
    }
}
