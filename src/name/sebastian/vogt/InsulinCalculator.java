package name.sebastian.vogt;

/**
 * Created by sebastian on 06.10.16.
 */
public class InsulinCalculator {


    protected double currentSugar = 0;
    protected double insulinFactor = 0;
    protected double correctionFactor = 0;
    protected double be = 0;
    protected double targetSugar;

    protected BECalculator beCalculator;



    public InsulinCalculator(double currentSugar, double insulinFactor, double correctionFactor, double targetSugar, double be) {
        this.currentSugar = currentSugar;
        this.insulinFactor = insulinFactor;
        this.correctionFactor = correctionFactor;
        this.targetSugar = targetSugar;
        this.be = be;
    }






    public double computeBolusInsulin() {
        double result = this.insulinFactor * this.be;
        return result;
    }

    public double computeCorrectionInsulin() {
        if(this.currentSugar > this.targetSugar) {
            return (this.currentSugar - targetSugar) / this.correctionFactor;
        }
        return 0;

    }



    public double computeTotalInsulin() {
        return this.computeBolusInsulin() + this.computeCorrectionInsulin();
    }


}
