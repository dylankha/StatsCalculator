import java.util.Arrays;

public class StatsCalculator {
    private double [] values =  {10.0, 20.0, 5.0, 15.0, 25.0, 30.0, 8.0};
    private double [] sortedValues;

    /**
     *  default constructor makes an array of size 20 full of 0s
     */
    public StatsCalculator(){
        this.sortedValues = new double[20];
    }

    /**
     * Overloaded constructor that sets instance variable equal to the parameter
     * @param values
     */
    public StatsCalculator(double[] values){
        this.sortedValues = values;
    }

    /**
     * Sorts the sortedValues array
     */
    public void sortData(){
        Arrays.sort(sortedValues);
    }

    public double calculateMax(){
        double max = 0;
        for (int i = 1; i < sortedValues.length; i++){
            if (sortedValues[i] > sortedValues[i-1]){
                max = sortedValues[i];
            }
        }
        return max;
    }

    public double calculateMin(){
        double min = 0;
        for (int i = 1; i < sortedValues.length; i++){
            if (sortedValues[i] < sortedValues[i-1]){
                min = sortedValues[i];
            }
        }
        return min;
    }




}