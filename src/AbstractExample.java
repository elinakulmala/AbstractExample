public class AbstractExample {

	public static void main(String[] args)
	{
	   Square square1 = new Square(12);
       square1.calcArea();
       square1.printArea();
	}
}

abstract class Shape
{
    public double area;

    abstract public double calcArea();

    public void printArea()
    {
        System.out.println(area);
    }
}

class Square extends Shape
{
    private double side;

    public Square(double side)
    {
        this.side = side;
    }

    @Override
    public double calcArea() {
        area = side * side;
        return area;
    }
}
