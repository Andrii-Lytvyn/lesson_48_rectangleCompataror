/*
Создать класс Rectangle (прямоугольник), которому в конструкторе нужно передавать длину и ширину.
Написать компаратор, который сравнивает прямоугольники по площади.
Написать тесты для этого компаратора.*/
public class Rectangle {
  private final Integer width;
  private final Integer height;
  public Rectangle(int width, int height)
  {
    this.width = width;
    this.height=height;
  }
  public Integer square ()
  {
   return width*height;
  }


  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  @Override
  public String toString() {
    return "width:" + width +" height:" + height + " square: " + square();
  }
}
