public class Main {
    public static void main(String[] args) {
        int[] sale = {
                1,
                3,
                5
        };
        SalesManager salesManager = new SalesManager(sale);
        System.out.println(salesManager.max());
    }
}