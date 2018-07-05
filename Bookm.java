import java.util.Scanner;
public class Bookm {

    public void createbooks(Book z[],int n) {
        for(int i=0; i<n; i++) {
            System.out.println("enter the info about book" + (i + 1));
            Float x = z[i].getPrice();
            z[i].setPrice(x);
            String y = z[i].getTitle();
            z[i].setTitle(y);
        }
    }
    public void showbooks(Book z[], int n){
        for(int i=0;i<n;i++) {
            System.out.println("Info about book" + (i + 1));
            System.out.println("Book Title :" + z[i].title);
            System.out.println("Book price :" + z[i].price);
        }
    }


    public static void main(String args[]) {
        Bookm m = new Bookm();

        System.out.println("enter how many books want to create");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Book b[] = new Book[n];
        for (int i = 0; i < n; i++)
            b[i] = new Book();

        m.createbooks(b, n);
        m.showbooks(b, n);
    }

}