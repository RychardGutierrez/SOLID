import java.util.List;

public class AreaCalculatorV2 implements IAreaCalculator {
    @Override
    public double sum(List<Shape> shapes) {
        int sum = 0;
        for (int i = 0; i < shapes.size(); i++) {
            sum += shapes.get(i).area();
        }
        return sum;
    }
}
