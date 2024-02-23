import java.util.List;

public class ShapesPrinter {
    private IAreaCalculator areaCalculator;

    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String json(List<Shape> shapes) {
        double result = areaCalculator.sum(shapes);
        return "{\"result\":" + result + "}";
    }

    public String csv(List<Shape> shapes) {
        double result = areaCalculator.sum(shapes);
        return "result, " + result;
    }
}
