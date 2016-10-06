package name.sebastian.vogt;

/**
 * Created by sebastian on 06.10.16.
 */
public class InsulinCalculator {


    protected double bloodSugar = 0;
    protected double insulinFactor = 0;
    protected double correctionFactor = 0;
    protected double be = 0;
    protected Range targetSugar;

    protected BECalculator beCalculator;

    public InsulinCalculator(double bloodSugar, double insulinFactor, double correctionFactor, Range targetSugar, BECalculator beCalculator) {
        this.bloodSugar = bloodSugar;
        this.insulinFactor = insulinFactor;
        this.correctionFactor = correctionFactor;
        this.targetSugar = targetSugar;
        this.beCalculator = beCalculator;
        this.be = this.beCalculator.compute();
    }






    public double computeBolusInsulin() {
        double result = this.insulinFactor * this.be;
        return result;
    }

    public double computeCorrectionInsulin() {
        return (this.bloodSugar - targetSugar.getStop()) / this.correctionFactor;
    }

    public double computeCorrectionInsulin(boolean centered) {
        if(centered) {
            double tempAverage = (targetSugar.getStop() - targetSugar.getStart()) / 2;
            return (this.bloodSugar - tempAverage) / this.correctionFactor;
        }
        return this.computeCorrectionInsulin();
    }

    public double computeTotalInsulin() {
        return this.computeBolusInsulin() + this.computeCorrectionInsulin();
    }

    public double computeTotalInsulin(boolean centered) {
        return this.computeBolusInsulin() + this.computeCorrectionInsulin(centered);
    }
}
