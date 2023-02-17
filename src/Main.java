public class Main {
    public static void main(String[] args) {
        long[] sale = {
                6,
                3,
                5,
                7,
                9
        };
        SalesManager salesManager = new SalesManager(sale);
        System.out.println(salesManager.max());
        System.out.println(salesManager.Calculation(sale));
    }
}