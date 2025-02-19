public class Ellipse extends Shape{
    private
        final double width, height;
    public
        Ellipse(double width, double height){
            this.width = width;
            this.height = height;
        }
        @Override
        public double calculateArea() {
            return Math.PI * (width/2) * (height/2) ;
        }
        double AreaCalculator(Ellipse ellipse) {
            return this.calculateArea();
        }
}
