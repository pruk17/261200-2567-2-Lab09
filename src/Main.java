public class Main {
    public static void main(String[] args) {
        System.out.println("----- OCP -----");
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 10);
        Ellipse ellipse = new Ellipse(5, 10);
        System.out.println("Circle Area: " + circle.AreaCalculator(circle));
        System.out.println("Rectangle Area: " + rectangle.AreaCalculator(rectangle));
        System.out.println("Ellipse Area: " + ellipse.AreaCalculator(ellipse));

        System.out.println("----- LSP  -----");
        Penguin penguin = new Penguin();
        System.out.println("Penguin:(move) " + penguin.move());
        System.out.println("        (swim) " + penguin.swim());
        Sparrow sparrow = new Sparrow();
        System.out.println("Sparrow:(move) " + sparrow.move());
        System.out.println("        (fly ) " + sparrow.fly());
        Ostrich ostrich = new Ostrich();
        System.out.println("Ostrich:(move) " + ostrich.move());
        Eagle eagle = new Eagle();
        System.out.println("Eagle:(move) " + eagle.move());
        System.out.println("      (fly ) " + eagle.fly());
        System.out.println("      (hunt) " + eagle.hunt());

        System.out.println("----- DIP  -----");
        OrderProcessor order_Email = new OrderProcessor(new EmailNotifier());
        OrderProcessor order_SMS = new OrderProcessor(new SMSNotifier());
        order_Email.processOrder(order_Email);
        order_SMS.processOrder(order_SMS);
    }
}