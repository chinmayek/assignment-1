import java.util.Scanner;
public class Book {

    public float price;
    public String title;

    Scanner sc=new Scanner(System.in);

    public float getPrice() {
        System.out.println("enter the price");
        float x=sc.nextFloat();
        sc.nextLine();
        return x;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTitle() {
        System.out.println("enter the title");
        String y=sc.nextLine();
        return y;
    }


    public void setTitle(String title) {
        this.title = title;
    }

}