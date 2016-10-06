package name.sebastian.vogt;

public class Main {

    public static BECalculator beCalculator;
    public static InsulinCalculator insulinCalculator;
    public static Range range;

    public static void main(String[] args) {
	// write your code here
        beCalculator = new BECalculator(100, 24, 200, BECalculator.BE);
        System.out.println("BE = " + beCalculator.compute());

        range = new Range(4, 9);
        /*System.out.println(range.inRange(6));
        System.out.println(range.inRange(11));*/

        insulinCalculator = new InsulinCalculator(11, 1.5, 2, range, beCalculator);
        System.out.println("Bolus IE = " + insulinCalculator.computeBolusInsulin());
        System.out.println("Korrektur IE = " + insulinCalculator.computeCorrectionInsulin());
        System.out.println("Gesamt IE = " + insulinCalculator.computeTotalInsulin());



    }
}
