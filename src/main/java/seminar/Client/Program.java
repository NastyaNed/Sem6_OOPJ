package seminar.Client;

import seminar.Mathematic.CalculateArea.CalculateComplex;
import seminar.Mathematic.CalculateArea.CalculateRational;
import seminar.UI.App;

public class Program {
    public static void main(String[] args) {
        CalculateComplex calcCompl1 = new CalculateComplex( 15, 37 );
        CalculateRational calcRation1 = new CalculateRational( 3, 30 );
        App.ButtonClick(calcCompl1);
    }
}
