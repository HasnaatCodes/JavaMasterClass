package com.company;

public class Point {

    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
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

    public double distance(){
        return distance(0, 0);
    }

    public double distance(int a, int b){
        return Math.sqrt((a - this.x) * (a - this.x) + (b - this.y) * (b - this.y));
    }

    public double distance(Point point){
        return distance(point.getX(), point.getY());
    }

}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}

