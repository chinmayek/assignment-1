package pro6;

public class Eployee {
    private int num;
    private String name;
    private int dd, mm, yyyy;


    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(int dd, int mm, int yyyy) {
        this.dd = dd;
        this.mm = mm;
        this.yyyy = yyyy;
    }

    public void getDate() {
        System.out.println("Employee date : "+dd+"/"+mm+"/"+yyyy);
    }

}
