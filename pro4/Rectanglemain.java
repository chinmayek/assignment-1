package pro4;

import java.util.Scanner;
public class Rectanglemain {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter 5 rectangle info ");

        Rectangle obj[]=new Rectangle[5];

        for(int i=0; i<5; i++){
            obj[i]=new Rectangle();
            float length, width;
            int x,y;
            System.out.println("\nenter info about rectabgle "+(i+1));

                do {
                    System.out.println("enter the length between range 0 - 20");
                    length=sc.nextFloat();
                    x=obj[i].setLength(length);
                }while(x==0);

                do {
                    System.out.println("enter the width range between 0-20");
                    width=sc.nextFloat();
                    y=obj[i].setWidth(width);
                }while(y==0);
        }

        for(int i=0;i<5;i++){
            System.out.println("\nInfo about rectangle"+(i+1));
            System.out.println("length is "+obj[i].getLength());
            System.out.println("width is "+obj[i].getWidth());
            System.out.println("area is "+obj[i].area());
            System.out.println("perimeter is "+obj[i].perimeter());
        }

    }

}
