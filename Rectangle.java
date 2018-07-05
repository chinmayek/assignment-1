import java.util.Scanner;
public class Rectangle {
    private float len;
    private float bre;
    private float ar;
   Rectangle(){
        len=0;
        bre=0;
    }
    Rectangle(float a, float b){
        len=a;
        bre=b;
    }
    Scanner sc=new Scanner(System.in);
    public float getLen() {
        System.out.println("enter the length");
        len=sc.nextFloat();
        return len;
    }

    public void setLen(float len) {
        this.len = len;
    }

    public float getBre() {
        System.out.println("enter the bredth");
        bre=sc.nextFloat();
        return bre;
    }

    public void setBre(float bre) {
        this.bre = bre;
    }

    public void area(){
        ar=len*bre;
    }
    public void display(){
        System.out.println("length is "+len);
        System.out.println("breadth is "+bre);
        System.out.println("area is "+ar);
    }

}
