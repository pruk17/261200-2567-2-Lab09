public class Rectangle extends Shape {
    private
        final double width, height;
    public
        Rectangle (double width, double height){
        this.width = width;
        this.height = height;
    }
        @Override
        public double calculateArea() {
            return this.width * this.height;
        }
    double AreaCalculator(Rectangle rectangle) {
        return this.calculateArea();
    }
}
