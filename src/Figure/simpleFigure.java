package Figure;

public class simpleFigure {
    protected int a , b;

    public simpleFigure(int a) {
        this.a = a;
    }

    public simpleFigure(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int areaCalculation() {
        int c = a * b;
        return c;
    }

    public int perimetrCalculation() {
        int c = (a * 2) + (b * 2);
        return c;
    }
}


