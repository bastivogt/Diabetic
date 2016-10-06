package name.sebastian.vogt;

/**
 * Created by sebastian on 06.10.16.
 */
public class BECalculator {

    public static final int BE = 12;
    public static final int KHE = 10;

    protected double value = 0;
    protected double carbonProValue = 0;
    protected double valueEat = 0;
    protected int measure = 0;


    public BECalculator(double value, double carbonProValue, double valueEat, int measure) {
        this.value = value;
        this.carbonProValue = carbonProValue;
        this.valueEat = valueEat;
        this.measure = measure;
    }




    public double compute() {
        double result = (this.valueEat * this.carbonProValue / value) / this.measure;
        return result;
    }

}
