package com.chess.entities;

public class ChessPiece {
    private int positionX;
    private int positionY;
    private Color color;

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

}
