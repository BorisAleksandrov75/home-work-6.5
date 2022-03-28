package Figure;

public class square extends simpleFigure{

    private int d;

    public square(int a, int b) {
        super(a, b);
    }

    @Override
    public int areaCalculation() {
        return (int) Math.pow(a,2);
    }

    @Override
    public int perimetrCalculation() {
        return super.perimetrCalculation();
    }
}
