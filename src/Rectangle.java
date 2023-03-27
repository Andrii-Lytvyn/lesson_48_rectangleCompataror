/*
Создать класс Rectangle (прямоугольник), которому в конструкторе нужно передавать длину и ширину.
Написать компаратор, который сравнивает прямоугольники по площади.
Написать тесты для этого компаратора.*/
public class Rectangle {
  private final int width;
  private final int height;
  public Rectangle(int width, int height)
  {
    this.width = width;
    this.height=height;
  }



  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

}
