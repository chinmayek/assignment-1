import java.util.Scanner;
public class Pro4m {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter num of rectangle ");
        int n=sc.nextInt();

        Pro4[] obj=new Pro4[n];
        for(int i=0; i<n; i++){
            obj[i]=new Pro4();
        }

        int x=0, y=0;
        for(int i=0;i<n;i++){
            System.out.println("enter info about obj"+(i+1));

            do {
                float a = obj[i].getLen();
                x = obj[i].setLen(a);
            }while(x==0);

            do {
                float b = obj[i].getWid();
                y = obj[i].setWid(b);
            }while(y==0);
        }
        for(int i=0;i<n;i++){
            System.out.println("Info about obj"+(i+1));
            obj[i].area();
            obj[i].perimeter();
            obj[i].display();
        }

    }

}
