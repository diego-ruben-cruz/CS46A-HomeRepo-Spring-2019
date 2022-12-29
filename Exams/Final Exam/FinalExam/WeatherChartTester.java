public class WeatherChartTester
{
    public static void main(String[] args)
    {
        //if the constant is defined correctly, this will compile
        System.out.println(WeatherChart.ABSOLUTE_ZERO);
        System.out.println("Expected: -273.15");
        
        double[][] values = {
            {5, 7, 9.5, 16, 23, 26, 28, 25, 22, 15, 9.5, 4.4},
            {-10.1, -15, -25, -30, -50.3, -80, -75, -65, -30, -29, -11, -15},
            {0.6, 1.4, 4.8, 8.9, 14.3, 17, 19, 19, 14.5, 9.7, 5, 2}
        };
        
        WeatherChart chart = new WeatherChart(values);
        System.out.println(chart.locationLow(0));
        System.out.println("Expected: 4.4");
        System.out.println(chart.locationLow(1));
        System.out.println("Expected: -80.0");
        System.out.println(chart.locationLow(2));
        System.out.println("Expected: 0.6");
        System.out.println(chart.locationLow(3));
        System.out.println("Expected: -273.15");
        System.out.println(chart.locationLow(-1));
        System.out.println("Expected: -273.15");
        
        System.out.println(chart.mildCount());
        System.out.println("Expected: 7");
        
        double[][] values2 = {
            {5, 7, 9.5, 16, 23, 26, 28, 25, 22, 15, 9.5, 4.4},
            {-10.1, -15, -25, -30, -50.3, -80, -75, -65, -30, -29, -11, -15},
            {0.6, 1.4, 4.8, 8.9, 14.3, 17, 19, 19, 14.5, 9.7, 5, 2},
            {27, 29, 18, 20, 19.01, 28.01, 19, 18.99, 23, 36, 26, 30.1}
        };
        
        chart = new WeatherChart(values2);
        System.out.println(chart.mildCount());
        System.out.println("Expected: 13");
    }
}