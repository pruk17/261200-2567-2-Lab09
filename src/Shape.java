public abstract class Shape extends AreaCalculator{
    public abstract double calculateArea();

    public double AreaCalculator(Shape shape){
        return shape.calculateArea();
    }
}
