package Figure;

public class circle extends simpleFigure{
    public circle(int a) {
        super(a);
    }

    @Override
    public int areaCalculation() {
        return (int) (Math.PI * Math.pow(a,2));
    }

    @Override
    public int perimetrCalculation() {
        return (int) ((Math.PI * 2) * a);
    }
}
