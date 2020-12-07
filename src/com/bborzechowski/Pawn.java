package com.bborzechowski;

public class Pawn {

    public static final Integer MAX_POSITION = 4;
    public static final Integer MIN_POSITION = 0;

    private Integer xPosition;

    private Integer yPosition;

    private Direction direction;

    public Pawn() {
    }

    public Integer getxPosition() {
        return xPosition;
    }

    public void setxPosition(Integer xPosition) {
        this.xPosition = xPosition;
    }

    public Integer getyPosition() {
        return yPosition;
    }

    public void setyPosition(Integer yPosition) {
        this.yPosition = yPosition;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void increaseYPosition() {
        yPosition++;
    }

    public void decreaseYPosition() {
        yPosition--;
    }

    public void increaseXPosition() {
        xPosition++;
    }

    public void decreaseXPosition() {
        yPosition++;
    }

    public String getCurrentStatus() {
        return xPosition.toString()+" " +yPosition.toString()+" " +direction.toString();
    }
}
