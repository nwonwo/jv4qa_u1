package nwo.stqa.sandbox;

public class Start {
  public static void main(String[] args) {
    Point p1 = new Point(1.0, 1.0);
    Point p2 = new Point(4.0, 4.0);
    System.out.println("Растояние между точками " + "p1" + " и " + "p2" + " = " + p1.distance(p2));
  }

}


