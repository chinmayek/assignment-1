package pro4;

import java.util.Scanner;
public class Rectangle {
    private float len;
    private float wid;
    private float area;
    private float perimeter;
    Rectangle(){
        len=0;
        wid=0;
        area=0;
        perimeter=0;
    }
    Rectangle(float a, float b) {
        len = a;
        wid = b;
    }

    public float getLen() {
        return len;
    }

    public void setLen(float len) {
        this.len = len;
    }

    public float getWid() {
        return wid;
    }

    public void setWid(float wid) {
        this.wid = wid;
    }

    public void area(){
        area=len*wid;
    }
    public void perimeter() {
        perimeter=2*(len+wid);
    }

    public void display(){
        System.out.println("length is "+len);
        System.out.println("breadth is "+wid);
        System.out.println("area is "+area);
        System.out.println("perimeter is "+perimeter);
    }
}
