public class Runner {
    public static void main(String[] args) {
        double[] values = {10.0, 20.0, 5.0, 15.0, 25.0, 30.0, 8.0};
        StatsCalculator myCalculator = new StatsCalculator(values);

        myCalculator.print();
        myCalculator.sortData();
        myCalculator.printSorted();
        myCalculator.printFiveNumberSummary();
        System.out.println("\nThe mean is: " + myCalculator.calculateMean());


    }
}

