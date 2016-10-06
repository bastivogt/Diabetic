package name.sebastian.vogt;

public class Main {

    public static BECalculator beCalculator;
    public static InsulinCalculator insulinCalculator;
    public static Range targetRange;
    public static double sugar = 0;
    public static double correctionFactor = 2; // um wieviel mmol/dl wird der Bluzucker mit 1 IE Bolus Insulin gesenkt

    public static void main(String[] args) {

        sugar = 11;

        // (gramm auf der Packung z.b. 100, gramm KH, gramm wieviel gegessen, BE oder KHE)
        beCalculator = new BECalculator(100, 24, 200, BECalculator.BE);
        System.out.println("BE = " + beCalculator.compute());

        targetRange = new Range(4, 9);
        /*System.out.println(range.inRange(6));
        System.out.println(range.inRange(11));*/

        insulinCalculator = new InsulinCalculator(sugar, 1.5, correctionFactor, targetRange.getStop(), beCalculator.compute());
        System.out.println("Bolus IE = " + insulinCalculator.computeBolusInsulin());
        System.out.println("Korrektur IE = " + insulinCalculator.computeCorrectionInsulin());
        System.out.println("Gesamt IE = " + insulinCalculator.computeTotalInsulin());



    }
}
