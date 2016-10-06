package name.sebastian.vogt;

/**
 * Created by sebastian on 06.10.16.
 */
public class Helpers {



    public static double roundDecPlaces(double value, int places) {
        return (Math.round(value * Math.pow(10, places)) / Math.pow(10, places));
    }

}
