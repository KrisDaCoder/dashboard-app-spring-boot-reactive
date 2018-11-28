package com.kristjan.dashboardappreactive.domain;

public class Coordinates {

    private int x;
    private int y;
    private int cols;
    private int rows;

    public Coordinates() {
    }

    public Coordinates(int x, int y, int cols, int rows) {
        this.x = x;
        this.y = y;
        this.cols = cols;
        this.rows = rows;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }
}
