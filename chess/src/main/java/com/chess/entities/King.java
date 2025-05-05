package com.chess.entities;

public class King extends ChessPiece {
    public King(int positionX, int positionY, Color color) {
        super(positionX, positionY, color);
    }

    // ✅ 👍
    // Ce n'est pas à faire ici mais il pourra y avoir la condition d'echec
    @Override
    public boolean canMoveTo(int positionX, int positionY) {
        // Ensuring piece doesn't move out of allowed range
        if (!isOnChessboard(positionX, positionY)) {
            return false;
        }

        int xOffset = Math.abs(this.getPositionX() - positionX);
        int yOffset = Math.abs(this.getPositionY() - positionY);

        return xOffset <= 1 && yOffset <= 1;
    }
}
