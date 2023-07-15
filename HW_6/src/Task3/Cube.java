package Task3;

// класс куб с подключенными интерфейсами площади и объема
public class Cube implements ShapeArea, ShapeVolume {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
