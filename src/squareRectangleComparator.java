import java.util.Comparator;
public class squareRectangleComparator implements Comparator<Rectangle> {

  @Override
  public int compare(Rectangle o1, Rectangle o2) {
    if(!o1.square().equals(o2.square()));
    {
      return o1.square().compareTo(o2.square());
    }

  }
}