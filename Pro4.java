import java.util.Scanner;
public class Pro4 {
    private float len;
    private float wid;
    private float ar;
    private float p;
    Pro4(){
        len=1;
        wid=1;
    }

    Scanner sc=new Scanner(System.in);
    public float getLen() {
        System.out.println("enter the length between range 0 - 20");
        len=sc.nextFloat();
        return len;
    }

    public int setLen(float len) {
        this.len = len;
        if(len<0 || len>20){
            System.out.println("length is not in the range");
            return 0;
        }
        return 1;
    }

    public float getWid() {
        System.out.println("enter the width");
        wid=sc.nextFloat();
        return wid;
    }

    public int setWid(float wid) {
        this.wid = wid;
        if(wid<0 || wid>20){
            System.out.println("width is not in the range");
            return 0;
        }
        return 1;
    }

    public void area(){
        ar=len*wid;
    }
    public void perimeter() {
        p=2*(len+wid);
    }

    public void display(){
        System.out.println("length is "+len);
        System.out.println("breadth is "+wid);
        System.out.println("area is "+ar);
        System.out.println("perimeter is "+p);
    }
}
