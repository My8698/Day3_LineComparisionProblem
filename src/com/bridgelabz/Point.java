package com.bridgelabz;
import java.util.Scanner;
public class Point {
    private int x,y;//to take coordinates of point
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    Point(){

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
    public void getPoints(){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter X:");
        x=scn.nextInt();
        System.out.println("Enter Y:");
        y=scn.nextInt();
    }
}
