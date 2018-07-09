package pro4;

public class Rectangle {
    private double length;
    private double width;

    Rectangle(){
        length=0;
        width=0;
    }
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public int setLength(double length) {
        int x=0;
        if(length<0 || length>20) {
            System.out.println("length is not in the range");
            return x;
        }
        else {
            this.length = length;
            return (x = 1);
        }
    }

    public double getWidth() {
        return width;
    }

    public int setWidth(float width) {
        int y=0;
        if(width<0 || width>20) {
            System.out.println("width is not in the range");
            return y;
        }
        else {
            this.width = width;
            return (y = 1);
        }
    }

    public double area(){
        return (length*width);
    }
    public double perimeter() {
        return (2*(length+width));
    }

}
