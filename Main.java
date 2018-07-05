import java.util.Scanner;
public class Main {
    public static void main(String args[]){

        Eployee e[]=new Eployee[5];
        for(int i=0; i<5; i++)
            e[i]=new Eployee();

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<5; i++){
            System.out.println("enter the details of employee "+(i+1));
            System.out.print("name:");
            String name=sc.nextLine();
            e[i].setName(name);
            System.out.print("num:");
            int num=sc.nextInt();
            e[i].setNum(num);
            System.out.print("date: \ndd:");
            int dd=sc.nextInt();
            System.out.print("mm:");
            int mm=sc.nextInt();
            System.out.print("yyyy:");
            int yyyy=sc.nextInt();
            e[i].setDate(dd,mm,yyyy);
            sc.nextLine();
        }
        for(int i=0; i<5; i++){
            System.out.println("\nDatails of employee "+(i+1));
            System.out.println("Employee name : "+e[i].getName());
            System.out.println("Employee num : "+e[i].getNum());
            e[i].getDate();
        }
    }
}