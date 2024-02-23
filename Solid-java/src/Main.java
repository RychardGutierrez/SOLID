import java.util.List;


public class Main {
    public static void main(String[] args) {
        IAreaCalculator areaCalculator = new AreaCalculator();
        IAreaCalculator areaCalculator2 = new AreaCalculatorV2();
        Shape circle = new Circle(10);
        Square square = new Square(10); // Liskov Substitution Principle - реализация интерфейса должна иметь возможность использоваться в качеств�
        Cube cube = new Cube();
        Shape rectangle = new Rectangle();
        ShapesPrinter printer = new ShapesPrinter(areaCalculator2);

        List<Shape> shapes = List.of(circle, square, cube, rectangle);
//        double sum = areaCalculator.sum(shapes);
        System.out.println(printer.json(shapes));
        System.out.println(printer.csv(shapes));
    }
}