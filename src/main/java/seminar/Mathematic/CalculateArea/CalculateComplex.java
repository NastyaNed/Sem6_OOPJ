package seminar.Mathematic.CalculateArea;

import seminar.Interface.Calculating;
import seminar.Mathematic.Numbers.Num;

public class CalculateComplex extends Num implements Calculating<Num> {
    public CalculateComplex(double x, double y) {
        super( x, y );
    }

    @Override
    public Num sum() {
        return new Num( (x + w), (y + z) );
    }

    @Override
    public Num diff() {
        return new Num( (x - y), (w - z) );
    }

    @Override
    public Num mult() {
        return new Num( (x * y - w * z), (x * z + w * y) );
    }

    @Override
    public Num div() {
        return new Num( (x * y + w * z) / (y * y + z * z), (y * w - x * z) / (y * y + z * z) );
    }
}
