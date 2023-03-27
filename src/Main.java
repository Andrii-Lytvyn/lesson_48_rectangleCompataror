import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Rectangle> rectangleList = new ArrayList<>();
    rectangleList.add(new Rectangle(3,4));
    rectangleList.add(new Rectangle(5,6));
    rectangleList.add(new Rectangle(2,3));
    System.out.println("Usual list");
    for (Rectangle rect: rectangleList)
    {
      System.out.println(rect);
    }
    System.out.println();
    System.out.println("Sorted list");
    rectangleList.sort(new squareRectangleComparator());

    for (Rectangle rect: rectangleList)
    {
      System.out.println(rect);
    }

  }
}