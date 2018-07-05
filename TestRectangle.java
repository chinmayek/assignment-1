public class TestRectangle {
    public static void main(String args[]){
        Rectangle obj[]=new Rectangle[5];
        for(int i=0; i<5; i++){
            obj[i]=new Rectangle();
        }
        for(int i=0;i<5;i++){
            System.out.println("enter info about obj"+(i+1));
            float a=obj[i].getLen();
            obj[i].setLen(a);
            float b=obj[i].getBre();
            obj[i].setBre(b);
        }
        for(int i=0;i<5;i++){
            System.out.println("Info about obj"+(i+1));
            obj[i].area();
            obj[i].display();
        }

    }
}
