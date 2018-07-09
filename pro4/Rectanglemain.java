package pro4;

import java.util.Scanner;
public class Rectanglemain {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter 5 rectangle info ");
        //int n=sc.nextInt();

        Rectangle obj[]=new Rectangle[5];
        for(int i=0; i<5; i++){
            float x, y;
            System.out.println("\nenter info about rectabgle"+(i+1));

                do {
                    System.out.println("enter the length between range 0 - 20");
                    x=sc.nextFloat();
                    if(x<0 || x>20)
                        System.out.println("length is not in the range");
                    else
                        break;
                }while(x<0 || x>20);

                do {
                    System.out.println("enter the width range between 0-20");
                    y=sc.nextFloat();
                    if(y<0 || y>20)
                        System.out.println("width is not in the range");
                    else
                        break;
                }while(y<0 || y>20);

            obj[i]=new Rectangle(x,y);
            obj[i].setLen(x);
            obj[i].setWid(y);
        }


        for(int i=0;i<5;i++){
            System.out.println("\nInfo about rectangle"+(i+1));
            obj[i].area();
            obj[i].perimeter();
            obj[i].display();
        }

    }

}
