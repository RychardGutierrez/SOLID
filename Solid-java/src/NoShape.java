public class NoShape implements Shape {
    @Override
    public double area() {
        throw new IllegalStateException("Ups error in this area");
    }
}
