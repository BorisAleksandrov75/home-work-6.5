package Figure;

public class Trapeze extends simpleFigure {

    private int h;

    public Trapeze(int a, int b, int h) {
        super(a, b);
        this.h = h;
    }

    @Override
    public int areaCalculation() {
        return ((a + b) / 2) * h;
    }

    @Override
    public int perimetrCalculation() {
        return (int) (Math.sqrt(Math.pow(h, 2) + Math.pow((b - a)/2, 2)) * 2) + a + b;
    }
}
