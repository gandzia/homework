package com.epam.mentoring1;

        import org.testng.Assert;

        import java.util.ArrayList;
        import java.util.List;

        import static com.epam.mentoring1.InputData.inputData;

public class EQSolver {
    public static List<Double> calculate(double a, double b, double c) {

        Assert.assertFalse(a == 0, "Value of divider is 0!");
        Assert.assertFalse((b*b-4*a*c) < 0, "Value under square root is negative!");

        double x1, x2;
        x1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        x2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

        List<Double> calculatedValues = new ArrayList<Double>();
        calculatedValues.add(x1);
        calculatedValues.add(x2);

        return calculatedValues;
    }

}

