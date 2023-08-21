package IntrodutionToOOP.Lab3;
import IntrodutionToOOP.Lab2.Box;

class BoxDriver{
    public static void main(String[] args) {
        Box box1 = new Box(10.0);
        Box box2 = new Box(5, 6, 7);
        for(Box box: new Box[] {box1, box2}){
            System.out.println(box.getHeight());
            System.out.println(box.getLength());
            System.out.println(box.getWidth());
        }
    }
}