package Figure;

public class righttriangle extends simpleFigure{
    public righttriangle(int a, int b) {
        super(a, b);
    }

    @Override
    public int areaCalculation() {
        return (a * b)/2;
    }

    @Override
    public int perimetrCalculation() {
        return (int) Math.sqrt(Math.pow(a,2) + Math.pow(b,2)) + a + b;
    }
}
