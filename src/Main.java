public class Main {
    public static void main(String[] args) {
     Point point01 = new Point(1.0f,2.0f);
     System.out.println(point01);
   MovablePoint movablePoint01 = new MovablePoint(1.0f,2.0f,5.0f,10.0f);
        System.out.println(movablePoint01   );
        System.out.println(movablePoint01.move());
    }
}