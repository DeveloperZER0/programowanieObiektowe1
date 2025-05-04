package Inheritance;

public class Punkt {
    public double x,y;

    public Punkt() {
        x = 0.0;
        y = 0.0;
    }

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void zeruj() {
        x = 0.0;
        y = 0.0;
    }
    public void opis() {
        System.out.println("Punkt o współrzędnych x = "+x+", y = "+y);
    }
    public void przesun(int dis_x, int dis_y) {
        x += dis_x;
        y += dis_y;
    }
}
