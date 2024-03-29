import java.util.List;

public class AreaCalculator implements IAreaCalculator {
    public double sum(List<Shape> shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.area();
        }
        return sum;
    }
}
