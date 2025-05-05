package com.chess.entities;

public abstract class ChessPiece {
    private int positionX;
    private int positionY;
    private Color color;

    // ✅ Bons algos
    // Pour le roi (mais ce n'est pas à faire) canEat sera revu car il y aura la
    // condition de ne pas être mis en échec.
    public ChessPiece(int positionX, int positionY, Color color) {
        setPositionX(positionX);
        setPositionY(positionY);
        setColor(color);
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        if (positionX >= 1 && positionX <= 8) {
            this.positionX = positionX;
        } else {
            throw new IllegalArgumentException("Out of bounds, positionX cannot be under 1 or above 8.");
        }
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        if (positionY >= 1 && positionY <= 8) {
            this.positionY = positionY;
        } else {
            throw new IllegalArgumentException("Out of bounds, positionY cannot be under 1 or above 8.");
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Indicates if piece's coordinates are on the chessboard.
     * 
     * @param positionX
     * @param positionY
     * @return Boolean value depending on if piece is on chessboard.
     */
    public boolean isOnChessboard(int positionX, int positionY) {
        return positionX >= 1 && positionX <= 8 && positionY >= 1 && positionY <= 8;
    }

    public abstract boolean canMoveTo(int positionX, int positionY);

    public boolean canEat(ChessPiece piece) {
        return canMoveTo(piece.getPositionX(), piece.getPositionY()) && this.getColor() != piece.getColor();
    }
}
