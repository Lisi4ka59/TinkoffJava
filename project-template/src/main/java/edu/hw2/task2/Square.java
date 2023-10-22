package edu.hw2.task2;

public final class Square extends Rectangle {

    public Square() {
        super(0, 0);
    }

    @Override
    public Rectangle setWidth(int width) {
        if (this.height == width) {
            return this;
        }
        return super.setWidth(width);
    }

    @Override
    public Rectangle setHeight(int height) {
        if (height == this.width) {
            return this;
        }
        return super.setHeight(height);
    }
}
