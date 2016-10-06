package name.sebastian.vogt;

/**
 * Created by sebastian on 06.10.16.
 */
public class Range {

    protected double start = 0;
    protected double stop = 0;

    public Range(double start, double stop) {
        this.start = start;
        this.stop = stop;
    }

    public double getStart() {
        return this.start;
    }

    public void setStart(double value) {
        this.start = value;
    }

    public double getStop() {
        return this.stop;
    }

    public void setStop(double value) {
        this.stop = value;
    }

    public boolean inRange(double value) {
        if(this.start < this.stop) {
            if(value > this.start && value < this.stop) {
                return true;
            }
        }

        return false;
    }

}
