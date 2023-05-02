package Adaptar;

class Circle{
    public int radius;
}
class Rectangle{

    public int Width;
    public int Height;

}

class Square{
    public int Size;

}

class Calculator{
    public int GetArea(Rectangle rectangle){
        int area = rectangle.Width * rectangle.Height;
        return area;
    }

}

class CalculatorAdapter{
    public int GetArea(Square square){
        Calculator calculator = new Calculator();
        Rectangle rectangle = new Rectangle();
        rectangle.Width = rectangle.Height = square.Size;
        int area = calculator.GetArea(rectangle);
        return area;
    }
}


public class AdapterDesignPattern {

    public static void main(String[] args) {
        Square square = new Square();
        square.Size = 10;
        CalculatorAdapter adapter = new CalculatorAdapter();
        int area = adapter.GetArea(square);
        System.out.println("Area of squre : " +area);


        Rectangle rect = new Rectangle();
        rect.Height=10;
        rect.Width=12;
        Calculator calculator = new Calculator();
        int area1 = calculator.GetArea(rect);
        System.out.println("Area of Rectangle is: " +area1);

    }
}
