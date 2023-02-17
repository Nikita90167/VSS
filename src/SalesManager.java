public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public long Calculation (long [] countSales) {
        long count = 0;
        long max = 0;
        long min = countSales[0];
        long countSum = 0;
        for (int i = 0; i < countSales.length; i++) {
            if (countSales[i] > max) {
                max = countSales[i];
            }
            if (countSales[i] < min) {
                min = countSales[i];
            }
            count++;
            countSum += countSales[i];
        }
        long CalculationResult = ((countSum - (max + min)) / count);
        return CalculationResult;
    }
}
